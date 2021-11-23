protected void addData(char ch) {
    if (ch == 'D') {
        builder.append(ch);
    }else {
        if ((builder.length()) != 0) {
            if (ch == '\r') {
                java.lang.System.out.print("add scan");
                dataReceive.addScan(builder.toString());
                builder.setLength(0);
            }else {
                builder.append(ch);
            }
        }
    }
}