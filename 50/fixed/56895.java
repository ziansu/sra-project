public static void showGen() {
    if ((edu.ramos.ramosink.application.Main.resourceGen) == null)
        edu.ramos.ramosink.application.Main.resourceGen = new edu.ramos.ramosink.view.frames.ResourceGenFrame();
    
    edu.ramos.ramosink.application.Main.rootLayout.setCenter(edu.ramos.ramosink.application.Main.resourceGen.getAnchorPane());
}