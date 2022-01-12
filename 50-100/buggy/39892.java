public void loadRoomConfig() throws java.io.FileNotFoundException {
    java.io.FileReader reader = new java.io.FileReader(roomConfigFile);
    java.util.Scanner legend = new java.util.Scanner(reader);
    legend.useDelimiter(" ");
    while (legend.hasNextLine()) {
        java.lang.String ln = legend.nextLine();
        java.lang.String[] a = ln.split(",");
        rooms.put(a[0].charAt(0), a[1]);
    } 
    legend.close();
    return ;
}