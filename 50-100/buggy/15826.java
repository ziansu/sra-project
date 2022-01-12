public static java.util.HashMap<java.lang.String, java.lang.Boolean> DavisPutnam(java.util.ArrayList<java.lang.String> clauses, java.util.HashSet<java.lang.String> atoms) {
    java.util.HashMap<java.lang.String, java.lang.Boolean> assignments = new java.util.HashMap<>();
    for (java.lang.String atom : atoms) {
        assignments.put(atom, null);
    }
    for (java.lang.String atom : atoms) {
        return com.yf833.Main.DPL(atoms, clauses, assignments);
    }
    return null;
}