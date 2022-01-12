@java.lang.Override
public void onBackPressed() {
    if ((getSupportFragmentManager().findFragmentByTag(com.example.be.tasktracker.NewTaskActivity.STOPWATCH_TAG)) != null) {
        ((com.example.be.tasktracker.OnBackStackPressedListener) (getSupportFragmentManager().findFragmentByTag(com.example.be.tasktracker.NewTaskActivity.STOPWATCH_TAG))).onBackPressed();
    }
    super.onBackPressed();
}