public com.googlecode.lanterna.terminal.Terminal createWindowsTerminal() throws java.io.IOException {
    try {
        java.lang.Class<?> nativeImplementation = java.lang.Class.forName("com.googlecode.lanterna.terminal.WindowsTerminal");
        java.lang.reflect.Constructor<?> constructor = nativeImplementation.getConstructor(java.io.InputStream.class, java.io.OutputStream.class, java.nio.charset.Charset.class, UnixLikeTTYTerminal.CtrlCBehaviour.class);
        return ((com.googlecode.lanterna.terminal.Terminal) (constructor.newInstance(inputStream, outputStream, charset, UnixLikeTTYTerminal.CtrlCBehaviour.CTRL_C_KILLS_APPLICATION)));
    } catch (java.lang.Exception ignore) {
        return createCygwinTerminal(outputStream, inputStream, charset);
    }
}