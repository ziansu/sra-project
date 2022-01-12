@java.lang.Override
public boolean isWriteResumed() {
    if ((next) == null) {
        return org.xnio.Bits.anyAreSet(state, io.undertow.conduits.DeflatingStreamSinkConduit.WRITES_RESUMED);
    }else {
        return next.isWriteResumed();
    }
}