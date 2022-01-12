public java.util.Set<com.example.lachlan.myfirstapp.code.Village> villages() {
    java.util.Set<com.example.lachlan.myfirstapp.code.Village> vils = new java.util.HashSet<com.example.lachlan.myfirstapp.code.Village>();
    for (com.example.lachlan.myfirstapp.code.Location loc : locations()) {
        if ((loc.municipality.equals(municipality)) && (loc.subdistrict.equals(name))) {
            vils.add(new com.example.lachlan.myfirstapp.code.Village(context, loc.municipality, loc.subdistrict, loc.village));
        }
    }
    return vils;
}