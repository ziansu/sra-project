@java.lang.Override
public org.fxmisc.undo.impl.nonlinear.QueuePosition getCurrentPosition() {
    return new QueuePositionImpl(((changes.isEmpty()) || ((currentPosition) == 0) ? null : changes.get(((currentPosition) - 1))), forgottenRevisionCount);
}