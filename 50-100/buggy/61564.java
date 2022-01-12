void setFinalStates(java.lang.String[] tuple) {
    for (int i = 1; i < (tuple.length); i++) {
        int stateNumber = java.lang.Integer.parseInt(tuple[1]);
        if ((states.get(stateNumber)) != null) {
            states.get(stateNumber).isFinalState = true;
        }else {
            states.put(stateNumber, new assignment3.State(stateNumber, true));
        }
    }
}