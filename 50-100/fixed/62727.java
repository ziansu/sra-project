public uk.ac.ebi.pride.gui.data.mztab.parser.readers.LineAndPositionAwareBufferedReader.PositionAwareLine readLine() throws java.io.IOException {
    java.lang.String line = reader.readLine();
    uk.ac.ebi.pride.gui.data.mztab.parser.readers.LineAndPositionAwareBufferedReader.PositionAwareLine readLine = null;
    if (line != null) {
        readLine = new uk.ac.ebi.pride.gui.data.mztab.parser.readers.LineAndPositionAwareBufferedReader.PositionAwareLine(((int) (reader.getLineNumber())), offset, line);
        offset += (line.getBytes().length) + (ncrlf);
    }
    return readLine;
}