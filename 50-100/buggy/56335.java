public void variableChangedEvent(dr.inference.model.Variable variable, int index, dr.inference.model.ChangeType type) {
    if (variable == (maskParameter)) {
        updateMask();
    }else {
        if ((inverseMap[index]) != (-1)) {
            fireParameterChangedEvent(inverseMap[index], type);
        }
    }
}