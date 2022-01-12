private void generateAllowedPorts() {
    java.util.Set<java.lang.Integer> tmp = new java.util.HashSet<>();
    java.lang.String whiteList = portWhiteList.get();
    for (java.lang.String s : whiteList.split(",")) {
        try {
            java.lang.Integer.parseInt(s);
        } catch (java.lang.NumberFormatException e) {
            return ;
        }
    }
    allowedPorts.set(tmp);
}