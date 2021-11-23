@java.lang.Override
public void Init() {
    super.Init();
    updateGameState(com.rengatartgital.photonandroidclient.AGame.GameAView.GameState.SetSide);
    iland_view.reset();
    iland_view.setHandler(main_activity.handler);
    for (int i = 0; i < 3; ++i)
        last_sensor_value[i] = 0;
    
    lock_step = false;
    btn_arrow_left.setEnabled(true);
    btn_arrow_right.setEnabled(true);
}