private com.googlecode.lanterna.terminal.Terminal createCygwinTerminal(java.io.OutputStream outputStream, java.io.InputStream inputStream, java.nio.charset.Charset charset) throws java.io.IOException {
    com.googlecode.lanterna.terminal.ansi.CygwinTerminal cygTerminal = new com.googlecode.lanterna.terminal.ansi.CygwinTerminal(inputStream, outputStream, charset);
    if ((inputTimeout) >= 0) {
        cygTerminal.getInputDecoder().setTimeoutUnits(inputTimeout);
    }
    return cygTerminal;
}