private java.util.Map<helper.Position, java.util.Map<java.lang.String, java.util.Set<java.lang.String>>> getRelationReprs() {
    java.util.Map<helper.Position, java.util.Map<java.lang.String, java.util.Set<java.lang.String>>> relationReprs = new java.util.HashMap<helper.Position, java.util.Map<java.lang.String, java.util.Set<java.lang.String>>>();
    for (helper.Position p : helper.Position.values()) {
        relationReprs.put(p, new java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>>());
    }
    return relationReprs;
}