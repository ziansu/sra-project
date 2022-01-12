protected void addData(char ch) {
    if ((ch == 'D') && ((builder.length()) > 0)) {
        dataReceive.addScan(builder.toString());
        builder.setLength(0);
    }
    builder.append(ch);
}