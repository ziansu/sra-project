public wah.giovann.csvhandler.CSVRecord insertData(java.util.ArrayList<java.lang.String> data) {
    wah.giovann.csvhandler.CSVRecord r = new wah.giovann.csvhandler.CSVRecord(this.header, data);
    this.add(r);
    return r;
}