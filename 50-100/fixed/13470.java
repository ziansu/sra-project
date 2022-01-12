public void cloneAndPushState() {
    java.util.HashMap<java.lang.String, java.lang.Object> item = ((java.util.HashMap<java.lang.String, java.lang.Object>) (stateValues.get(0).clone()));
    if (hasSetValue) {
        stateValues.add(0, item);
    }else {
        hasSetValue = true;
    }
}