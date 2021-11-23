@java.lang.Override
public void loadModelState(java.util.Map<java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>> stateMap) {
    if (!(isValidState)) {
        java.util.Map<java.lang.String, ? extends java.lang.Object> valueMap = stateMap.get(getId());
        if (valueMap == null) {
            throw new java.lang.IllegalArgumentException((("State map for object with id, " + (getId())) + " not found."));
        }
        loadState(valueMap);
        listenerHelper.fireModelChanged(this);
        isValidState = true;
    }
}