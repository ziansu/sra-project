private boolean hasTechnologyChanged(final com.qcadoo.model.api.Entity order, final com.qcadoo.model.api.Entity technology) {
    com.qcadoo.model.api.Entity existingOrder = getExistingOrder(order);
    if (existingOrder == null) {
        return false;
    }
    com.qcadoo.model.api.Entity existingOrderTechnology = existingOrder.getBelongsToField(TechnologiesConstants.MODEL_TECHNOLOGY);
    if (existingOrderTechnology == null) {
        return false;
    }
    return !(existingOrderTechnology.equals(technology));
}