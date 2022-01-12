@java.lang.Override
public void onBackPressed() {
    if ((this.task) != null) {
        this.task.setRunning(false);
    }
    super.onBackPressed();
}