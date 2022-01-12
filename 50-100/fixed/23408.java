@java.lang.Override
public int parseUIIndex(java.lang.String uiIndex) {
    uiIndex = uiIndex.toUpperCase();
    seedu.address.model.ModelManager.logger.info((">>>>>>>>>>>>query UI index:" + uiIndex));
    seedu.address.model.ModelManager.logger.info((">>>>>>>>>>>>Absolute index:" + ((indexMap.get(uiIndex)) + 1)));
    assert uiIndex != null;
    assert indexMap.containsKey(uiIndex);
    return (indexMap.get(uiIndex)) + 1;
}