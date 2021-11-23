public org.openforis.collect.model.NodeChangeSet addAttribute(org.openforis.idm.model.Entity parentEntity, java.lang.String attributeName, org.openforis.idm.model.Value value, org.openforis.collect.model.FieldSymbol symbol, java.lang.String remarks) {
    org.openforis.idm.model.Attribute<?, ?> attribute = performAttributeAdd(parentEntity, attributeName, value, symbol, remarks);
    setMissingValueApproved(parentEntity, attributeName, false);
    if (value == null) {
        applyInitialValue(attribute, true);
    }
    org.openforis.collect.model.NodeChangeMap changeMap = new org.openforis.collect.model.NodeChangeMap();
    changeMap.addAttributeAddChange(attribute);
    return afterAttributeInsertOrUpdate(changeMap, attribute);
}