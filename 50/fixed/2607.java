@java.lang.Override
public void onActivityResult(int reqCode, int resCode, android.content.Intent intent) {
    if ((command) != null) {
        command.success();
    }
}