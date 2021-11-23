public void exeucutePush6a() {
    long v = com.zms.zpc.execute.NumberUtils.asSigned(input.read(), 8);
    push_(v, getOpWidth());
}