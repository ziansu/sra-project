public void cloneAndPushState() {
    if (hasSetValue) {
        java.util.HashMap<java.lang.String, java.lang.Object> item = ((java.util.HashMap<java.lang.String, java.lang.Object>) (stateValues.get(0).clone()));
        stateValues.add(item);
    }else {
        hasSetValue = true;
    }
}