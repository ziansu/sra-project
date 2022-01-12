public static void displayError(java.lang.String title, java.lang.Throwable t, org.encog.workbench.frames.document.tree.ProjectFile network, org.encog.ml.data.MLDataSet set) {
    if (t instanceof org.encog.EncogError) {
        org.encog.workbench.EncogWorkBench.displayError(title, ("An error occured while performing this operation:\n" + (t.toString())));
        t.printStackTrace();
    }else
        if (t instanceof java.lang.OutOfMemoryError) {
            org.encog.workbench.EncogWorkBench.displayError(title, "Not enough memory to do that.");
            t.printStackTrace();
        }else
            org.encog.workbench.dialogs.error.ErrorDialog.handleError(t, network, set);
        
    
}