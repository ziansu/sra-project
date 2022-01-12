public static void runAnalysis(com.bwc.ora.models.AnalysisMode currentAnalysisMode) {
    try {
        switch (currentAnalysisMode) {
            case PREFORMATTED :
                new com.bwc.ora.analysis.PreformattedAnalysis().run();
                break;
            case MULTI_LRP_FREE_FORM :
                new com.bwc.ora.analysis.MultiLRPFreeFormAnalysis().run();
                break;
        }
    } catch (com.bwc.ora.analysis.AnalysisConditionsNotMetException e) {
        javax.swing.JOptionPane.showMessageDialog(null, (("An error was encountered:\n" + (e.getMessage())) + "\nRevise settings and try to run the analysis again."), "Settings Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}