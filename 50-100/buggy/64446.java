@java.lang.Override
public void onClick(android.view.View v) {
    if ((btnReady.getText()) == "not Ready") {
        de.szut.dqi12.texasholdem.guibackbone.Lobby.getInstance().setState(false);
        btnReady.setText("Ready");
    }else
        if ((btnReady.getText()) == "Ready") {
            de.szut.dqi12.texasholdem.guibackbone.Lobby.getInstance().setState(true);
            btnReady.setText("not Ready");
        }
    
}