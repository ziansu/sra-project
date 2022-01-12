public void recover() {
    _failed = false;
    for (java.util.Map.Entry<java.lang.String, Variable> e : _variables.entrySet()) {
        java.lang.String vid = e.getKey().substring(1);
        int id = java.lang.Integer.valueOf(vid);
        if ((id % 2) == 0) {
            e.getValue().blockRead();
        }
    }
    java.lang.System.out.println((("Site" + (_sid)) + " recovered"));
}