public void resetDisplay() {
    if ((((afpChain) != null) && ((ca1) != null)) && ((ca2) != null)) {
        java.lang.String script = getJmolString(afpChain, ca1, ca2);
        java.lang.System.out.println(script);
        jmolPanel.evalString("save STATE state_1");
    }
}