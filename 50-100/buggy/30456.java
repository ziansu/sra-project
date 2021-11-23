@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (((main.getSettings().getCMMFilePath()) != null) && (main.getSettings().equals(at.jku.ssw.cmm.gettext.Language._("Unnamed"))))
        main.getSaveManager().directSave();
    else
        main.getSaveManager().doSaveAs();
    
    main.setFileSaved();
    main.updateWinFileName();
    main.getRightPanel().getDebugPanel().updateFileName();
}