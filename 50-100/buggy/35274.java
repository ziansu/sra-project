public java.util.ArrayList readSettings() {
    java.util.ArrayList arrayList = new java.util.ArrayList();
    if (cScanner.hasNextLine()) {
        java.lang.String address = cScanner.nextLine();
        arrayList.add(0, address);
    }
    if (cScanner.hasNextInt()) {
        int port = cScanner.nextInt();
        arrayList.add(1, port);
    }
    assert (arrayList.size()) == 2;
    return arrayList;
}