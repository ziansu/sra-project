@java.lang.Override
public int getNumRows() {
    if ((numRows) > 0) {
        return numRows;
    }
    try {
        int lines = biocode.fims.reader.plugins.CSVReader.countLines(fileName);
        lines--;
        return lines;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return 0;
    }
}