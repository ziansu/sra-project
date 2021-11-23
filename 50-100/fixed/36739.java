private static shared.roles.RandomMember addRoles(java.lang.String name, java.lang.String color, shared.roles.Role... rs) {
    shared.roles.RandomMember roles = new shared.roles.RandomMember((name + " Random"), color);
    for (shared.roles.Role r : rs)
        roles.addMember(new shared.logic.Member(r, color));
    
    return roles;
}