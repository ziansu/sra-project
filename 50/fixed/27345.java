@java.lang.Override
public void suppress() {
    if ((this.barcodeBehavior) != null) {
        this.barcodeBehavior.suppress();
    }
    this.suppressed = true;
}