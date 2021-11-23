public static void main(java.lang.String[] args) throws java.lang.Exception {
    if ((args.length) != 2) {
        java.lang.System.out.println("Usage: java -cp PanelSegJ.jar ExpLabelDetectHogBootstrap <Sample List File> <target folder>");
        java.lang.System.out.println("	This is a utility program to Collect negative and positive patches for bootstrapping.");
        java.lang.System.exit(0);
    }
    gov.nih.nlm.lhc.openi.panelseg.ExpLabelDetectHogBootstrap generator = new gov.nih.nlm.lhc.openi.panelseg.ExpLabelDetectHogBootstrap(args[0], args[1]);
    generator.generateMulti(10);
    java.lang.System.out.println("Completed!");
}