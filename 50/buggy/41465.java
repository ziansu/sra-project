public void insertData(java.util.ArrayList<java.lang.String> data, int index) {
    wah.giovann.csvhandler.CSVRecord r = new wah.giovann.csvhandler.CSVRecord(this.header, data);
    this.add(index, r);
}