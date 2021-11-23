@java.lang.Override
public void fsmDoCreate(final com.jforex.programming.order.OrderSpecification orderSpecification) {
    if (!(positions.containsKey(orderSpecification.getInstrument())))
        addToNewPosition(orderSpecification);
    else
        addToExistingPosition(getOrderSpecificationForSwitchedPosition(orderSpecification));
    
}