public org.openprovenance.prov.model.HadMember add(org.openprovenance.prov.model.HadMember hm) {
    return add(hm, 2, anonHadMember, namedHadMemberMap, entityHadMemberMap, collHadMemberMap);
}