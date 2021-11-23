public static java.lang.String getJarFilePath() {
    return com.compomics.software.CompomicsWrapper.getJarFilePath(new eu.isas.searchgui.gui.SearchGUI().getClass().getResource("SearchGUI.class").getPath(), "SearchGUI");
}