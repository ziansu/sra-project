@java.lang.Override
public int execute(@org.jetbrains.annotations.NotNull
java.io.InputStream in, @org.jetbrains.annotations.NotNull
ru.spbau.mit.parsing.Token[] args) {
    try {
        for (ru.spbau.mit.parsing.Token arg : args) {
            out.write(arg.getContent().getBytes());
            out.write(" ".getBytes());
        }
    } catch (java.io.IOException e) {
        ru.spbau.mit.commands.EchoCommand.LOGGER.log(java.util.logging.Level.WARNING, "could not write to output stream", e);
        return 1;
    }
    return 0;
}