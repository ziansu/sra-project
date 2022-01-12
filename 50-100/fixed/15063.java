public void addForeignKey(model.Table t, java.lang.String cloumn, java.lang.Boolean Delete, java.lang.Boolean Update) {
    foreignKeys.put(t, cloumn);
    java.lang.System.err.println(cloumn);
    t.refrences.add(this);
    if (!Delete)
        t.onDelete = false;
    
    if (!Update)
        t.onUpdate = false;
    
}