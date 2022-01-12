public void createLoginSessionControl(java.lang.String name) {
    editor.putBoolean(io.github.fahadkh.gamblefitness.SessionManager.IS_LOGIN, true);
    editor.putString(io.github.fahadkh.gamblefitness.SessionManager.KEY_NAME, name);
    editor.putBoolean(io.github.fahadkh.gamblefitness.SessionManager.GOAL_SET, true);
    editor.putBoolean(io.github.fahadkh.gamblefitness.SessionManager.U_TYPE, false);
    editor.commit();
}