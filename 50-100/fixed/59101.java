@java.lang.Override
public void run() {
    v.getBackground().clearColorFilter();
    if ((QuestionAndButtons.size()) > 0) {
        next();
    }else {
        shared_preferences_editor = shared_preferences.edit();
        shared_preferences_editor.putInt("questionCounter", questionCounter);
        shared_preferences_editor.apply();
        countDown.cancel();
        startActivity(new android.content.Intent(this, com.example.dennis.nerdquiz.Score.class));
        finish();
    }
}