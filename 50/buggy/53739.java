public java.lang.Object getNativeGraphics() {
    if ((ng) == null) {
        ng = new com.codename1.impl.javase.JavaSEPort.NativeScreenGraphics();
    }
    return ng;
}