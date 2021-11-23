@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    if ((com.badlogic.gdx.Gdx.app) != null) {
        Gdx.app.exit();
    }else {
        notifyPluginsAboutClose();
        saveSettings();
        java.lang.System.exit(0);
    }
}