@java.lang.Override
public void body() {
    try {
        java.lang.String line = uk.co.nickthecoder.wrkfoo.tool.PlacesTool.buildLine(file.getValue(), label.getValue());
        java.nio.file.Files.write(getTask().store.getValue().toPath(), line.getBytes(), java.nio.file.StandardOpenOption.APPEND);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    this.go();
}