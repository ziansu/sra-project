public java.util.Set<com.example.lachlan.myfirstapp.code.Village> villages() {
    java.util.Set<com.example.lachlan.myfirstapp.code.Village> vils = new java.util.HashSet<com.example.lachlan.myfirstapp.code.Village>();
    for (com.example.lachlan.myfirstapp.code.Location loc : locations()) {
        if ((loc.municipality.equals(municipality.name)) && (loc.subdistrict.equals(name))) {
            vils.add(new com.example.lachlan.myfirstapp.code.Village(context, this.municipality, this, loc.village));
        }
    }
    return vils;
}