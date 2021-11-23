@java.lang.Override
public void write(char[] data, int offset, int count) throws java.io.IOException {
    java.lang.String message = java.lang.String.copyValueOf(data, offset, count);
    if (!(org.eclipse.xtext.util.Strings.Strings.isEmpty(message.trim()))) {
        org.eclipse.xtext.xtend2.compiler.batch.Xtend2BatchCompiler.log.debug(message);
    }
}