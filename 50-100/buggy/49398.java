public void generateListNiveau() {
    q.getSession().close();
    q.buildSession();
    java.util.List l = q.getAll("Niveau");
    for (int i = 0; i < (l.size()); i++) {
        java.lang.System.out.println();
        listNiveau.put(((com.ecole.models.Niveau) (l.get(i))).getDesignation(), ((com.ecole.models.Niveau) (l.get(i))).getCode_niveau());
    }
}