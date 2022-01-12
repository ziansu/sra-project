public void nextBuffer() {
    if ((buf) == null)
        buf = state.buffer();
    else
        buf = state.pushBuffer();
    
    heapArr = (buf.isDirect()) ? null : buf.array();
    baseOff = (buf.isDirect()) ? ((sun.nio.ch.DirectBuffer) (buf)).address() : org.apache.ignite.internal.util.GridUnsafe.BYTE_ARR_OFF;
}