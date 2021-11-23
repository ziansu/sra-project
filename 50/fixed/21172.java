@java.lang.Override
public void spawn(java.awt.Point spawningPosition) {
    resetStats();
    if (spawningPosition == null) {
        super.spawn(this.startPosition);
    }else {
        super.spawn(spawningPosition);
    }
}