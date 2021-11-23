@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent winEvt) {
    if (isDocumentOpen()) {
        if ((showUnsavedChangeWarning()) && (showIncompleteTagsWarning(false))) {
            try {
                getDriver().destroy();
                java.lang.System.exit(0);
            } catch (edu.brandeis.cs.nlp.mae.database.MaeDBException e) {
                showError(e);
            }
        }
    }else {
        java.lang.System.exit(0);
    }
}