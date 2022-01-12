private boolean doSubmitForFilledOrder(final com.dukascopy.api.IEngine.OrderCommand orderCommand) {
    final com.jforex.programming.order.OrderSpecification orderSpecification = orderParamsProvider.getOrderSpecificationForSwitchOrder(orderCommand, order.getAmount());
    final com.dukascopy.api.IOrder oppositeOrder = orderSubmissionPolicy.executeSubmitOrderPolicy(orderSpecification);
    if ((oppositeOrder == null) || ((oppositeOrder.getState()) != (IOrder.State.FILLED)))
        return false;
    
    order = orderSubmissionPolicy.executeMergeOrdersPolicy(org.apache.commons.lang3.StringUtils.chop(orderSpecification.getLabel()), order, oppositeOrder);
    return (order.getState()) == (IOrder.State.FILLED);
}