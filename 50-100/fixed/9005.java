public dna.FastqRecord readRecord() throws dna.RecordFormatException, java.io.IOException {
    java.lang.String line = theBufferedReader.readLine();
    if (line == null) {
        return null;
    }
    java.lang.String line1 = theBufferedReader.readLine();
    java.lang.String line2 = theBufferedReader.readLine();
    java.lang.String line3 = theBufferedReader.readLine();
    dna.FastqRecord output = new dna.FastqRecord(line, line1, line3);
    return output;
}