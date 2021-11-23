private java.util.ArrayList<com.example.lachlan.myfirstapp.code.Municipality> municipalities() {
    com.example.lachlan.myfirstapp.code.Location l;
    java.util.ArrayList<com.example.lachlan.myfirstapp.code.Municipality> m = new java.util.ArrayList<com.example.lachlan.myfirstapp.code.Municipality>();
    for (java.lang.String loc : locations()) {
        l = new com.example.lachlan.myfirstapp.code.Location(loc);
        m.add(new com.example.lachlan.myfirstapp.code.Municipality(this, l.municipality));
    }
    return m;
}