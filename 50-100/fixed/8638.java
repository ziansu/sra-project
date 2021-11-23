static void add(java.lang.String list, java.lang.String back, java.lang.String url) {
    java.lang.System.out.println(clientside.JukePiCmd.server.addToList(url, (list.equals("wl") ? true : false), (back.equals("b") ? false : true)));
}