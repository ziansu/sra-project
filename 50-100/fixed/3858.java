public void initRBSAEOSS() {
    java.lang.String path = "/Users/designassistant/Documents/workspace/design_assistant_HRC2/RBSAEOSS-Eval";
    AE = rbsa.eoss.ArchitectureEvaluator.getInstance();
    AG = rbsa.eoss.ArchitectureGenerator.getInstance();
    rbsa.eoss.local.Params params = null;
    java.lang.String search_clps = "";
    params = new rbsa.eoss.local.Params(path, "FUZZY-ATTRIBUTES", "test", "normal", search_clps);
    AE.init(1);
}