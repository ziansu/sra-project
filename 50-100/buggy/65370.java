@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    showUserSettings();
    player = new com.progettofondamenti.audioplayer.PlayerModel();
    try {
        player.initializeMPStreaming(uri);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    initializeXmlComponents();
    playerView = new com.progettofondamenti.audioplayer.PlayerView(player, this);
    playerView.run();
    setFragmentSettings();
    setListenersToButtons();
}