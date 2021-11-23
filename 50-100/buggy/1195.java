@java.lang.Override
public void handleDelete() throws java.io.IOException {
    if (((cursorPosition) > 0) && ((cursorPosition) < (lineLength))) {
        if (echo) {
            writer.write(27);
            writer.write('[');
            writer.write('1');
            writer.write('P');
        }
        lineBuffer.deleteCharAt(cursorPosition);
        lineLength = lineBuffer.length();
    }
}