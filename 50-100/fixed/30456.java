@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (((main.getSettings().getCMMFilePath()) == null) || (main.getSettings().getCMMFilePath().equals(at.jku.ssw.cmm.gettext.Language._("Unnamed"))))
        main.getSaveManager().doSaveAs();
    else
        main.getSaveManager().directSave();
    
    main.setFileSaved();
    main.updateWinFileName();
    main.getRightPanel().getDebugPanel().updateFileName();
}