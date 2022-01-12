@java.lang.Override
public void run() {
    if (this.isAvailable()) {
        android.content.Intent intent = com.idonans.doodle.demo.DoodlePlayActivity.start(this, path, false);
        this.startActivity(intent);
    }
}