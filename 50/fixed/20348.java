private boolean isNewLine(int ch) {
    return (ch == (org.neo4j.csv.reader.BufferedCharSeeker.EOL_CHAR)) || (ch == (org.neo4j.csv.reader.BufferedCharSeeker.EOL_CHAR_2));
}