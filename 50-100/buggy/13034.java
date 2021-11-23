private java.util.HashMap<helper.Position, java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>>> getRelationReprs() {
    java.util.HashMap<helper.Position, java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>>> relationReprs = new java.util.HashMap<helper.Position, java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>>>();
    for (helper.Position p : helper.Position.values()) {
        relationReprs.put(p, new java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>>());
    }
    return relationReprs;
}