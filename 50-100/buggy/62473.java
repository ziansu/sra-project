@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.main_menu_play :
            {
                application.setState(new com.lfg.informatik.q11.quizzing4abi.app_states.GameProperties1State(application));
            }
        case R.id.main_menu_scoreboard :
            {
                application.setState(new com.lfg.informatik.q11.quizzing4abi.app_states.ScoreboardState(application));
                break;
            }
        case R.id.main_menu_settings :
            {
                application.setState(new com.lfg.informatik.q11.quizzing4abi.app_states.SettingsState(application));
                break;
            }
        case R.id.main_menu_statistics :
            {
                application.setState(new com.lfg.informatik.q11.quizzing4abi.app_states.StatisticsState(application));
                break;
            }
    }
}