public static java.util.ArrayList<java.lang.String> getUntaggedPartnerLovedNames() {
    java.util.ArrayList<java.lang.String> untaggedPartnerLovedNamed = new java.util.ArrayList<java.lang.String>();
    com.agiv.names2.Name a = com.agiv.names2.NameTagger.untaggedNames.get(0);
    for (com.agiv.names2.Name name : com.agiv.names2.NameTagger.untaggedNames) {
        if ((name.lovedByPartner) == true)
            untaggedPartnerLovedNamed.add(name.name);
        
    }
    return untaggedPartnerLovedNamed;
}