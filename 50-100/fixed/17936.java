@java.lang.Override
public void changed(com.wotf.gui.view.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    try {
        gameSettings.setMaxTime(java.lang.Integer.parseInt(timerbox.getSelected().toString()));
        session.setGameSettings(gameSettings);
    } catch (java.rmi.RemoteException ex) {
        java.util.logging.Logger.getLogger(com.wotf.gui.view.SessionOnlinePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}