@java.lang.Override
public boolean isWriteResumed() {
    if ((next) == null) {
        return org.xnio.Bits.anyAreSet(io.undertow.conduits.DeflatingStreamSinkConduit.WRITES_RESUMED, state);
    }else {
        return next.isWriteResumed();
    }
}