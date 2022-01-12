private static java.util.HashMap<java.lang.String, java.lang.String> dummyReceiverHashMap() {
    java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
    java.lang.String[] hostnames = new java.lang.String[]{ "Laptop" , "Desktop" , "Arbeit" , "Opa-PC" };
    for (java.lang.String s : hostnames) {
        hashMap.put(s, net.sblit.gui.ConfigurationDialog.getRandomHexString(40));
    }
    java.lang.System.out.println(hashMap.toString());
    return hashMap;
}