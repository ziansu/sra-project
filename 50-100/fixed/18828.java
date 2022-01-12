public void verbose(java.lang.String message, java.lang.Object... params) {
    if (verbose) {
        log.info(org.fusesource.jansi.Ansi.ansi().fgBright(io.fabric8.maven.docker.util.BLACK).a(prefix).a(format(message, params)).reset().toString());
    }
}