@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    player = new com.progettofondamenti.audioplayer.PlayerModel();
    showUserSettings();
    initializeXmlComponents();
    playerView = new com.progettofondamenti.audioplayer.PlayerView(player, this);
    playerView.run();
    setFragmentSettings();
    setListenersToButtons();
}