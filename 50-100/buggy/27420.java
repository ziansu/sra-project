public static java.lang.String browse() {
    synchronized(MultiDNSServer.database) {
        java.lang.String records = "";
        for (java.lang.String type : MultiDNSServer.database.keySet()) {
            for (java.lang.String name : MultiDNSServer.database.get(type).keySet()) {
                records += (((("\nName: " + name) + "\n") + "Type: ") + type) + "\n";
            }
        }
        if (records.equals("")) {
            return "200 OK\nThe database is empty.";
        }else {
            return "200 OK\n" + records;
        }
    }
}