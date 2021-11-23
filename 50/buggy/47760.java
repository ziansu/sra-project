@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    main.getSaveManager().directSave();
    main.getSettings().writeXMLsettings();
    main.dispose();
    new at.jku.ssw.cmm.launcher.GUILauncherMain(new at.jku.ssw.cmm.gui.properties.GUImainSettings(null));
}