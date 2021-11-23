@java.lang.Override
public org.fxmisc.undo.impl.nonlinear.QueuePosition getCurrentPosition() {
    return new QueuePositionImpl((changes.isEmpty() ? null : changes.get(((currentPosition) - 1))), forgottenRevisionCount);
}