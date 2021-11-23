@java.lang.Override
public void onReset() {
    if ((this.status) == (com.Shaashimov.LightListener.LightListener.RUNNING)) {
        this.stop();
    }
}