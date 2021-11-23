@java.lang.Override
public void onReset() {
    super.onReset();
    if ((this.status) == (com.Shaashimov.LightListener.LightListener.RUNNING)) {
        this.stop();
    }
}