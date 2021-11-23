@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent winEvt) {
    if (isDocumentOpen()) {
        if ((showAllUnsavedChangeWarning()) && (showIncompleteTagsWarning(false))) {
            wipeDrivers();
            java.lang.System.exit(0);
        }
    }else {
        wipeDrivers();
        java.lang.System.exit(0);
    }
}