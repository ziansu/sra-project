@java.lang.Override
public void clampBuffer() {
    if ((buffer.amount) > (getCapacity())) {
        buffer.amount = getCapacity();
    }
    if ((buffer.amount) < 0) {
        buffer.amount = 0;
    }
}