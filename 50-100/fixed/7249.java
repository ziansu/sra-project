public java.util.Set<com.example.lachlan.myfirstapp.code.SubDistrict> subdistricts() {
    java.util.Set<com.example.lachlan.myfirstapp.code.SubDistrict> subs = new java.util.HashSet<com.example.lachlan.myfirstapp.code.SubDistrict>();
    for (com.example.lachlan.myfirstapp.code.Location loc : locations()) {
        if (loc.municipality.equals(name)) {
            subs.add(new com.example.lachlan.myfirstapp.code.SubDistrict(context, loc.municipality, loc.subdistrict));
        }
    }
    return subs;
}