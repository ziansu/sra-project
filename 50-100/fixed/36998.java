private org.w3c.dom.Element addCustomActionToSequence(java.lang.String id, boolean execute, java.lang.String sequenceAction, boolean after) {
    org.w3c.dom.Element executeSequence = getOrCreateChild(product, (execute ? "InstallExecuteSequence" : "InstallUISequence"));
    org.w3c.dom.Element custom = getOrCreateChildByKeyValue(executeSequence, "Custom", "Action", id);
    addAttributeIfNotExists(custom, (after ? "After" : "Before"), sequenceAction);
    return custom;
}