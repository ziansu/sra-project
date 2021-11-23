public void print(java.util.Set<java.lang.String> s, java.util.List<boa.types.Diff.ChangedFile> snapshot, java.util.Map<java.lang.String, boa.datagen.scm.AbstractCommit> commits) {
    java.util.List<java.lang.String> l = new java.util.ArrayList<java.lang.String>(s);
    java.util.Collections.sort(l);
    for (java.lang.String f : l)
        java.lang.System.out.println(((f + " ") + (commits.get(f).getId())));
    
    java.lang.System.out.println("==========================================");
}