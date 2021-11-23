@java.lang.Override
public void setPosition(long position) {
    this.position = position;
    setContentDescription(getProgressText());
}