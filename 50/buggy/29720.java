private void gotoMainActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.example.quanla.pomodoro.activities.MainActivity.class);
    intent.addFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
}