private by.anzak.notewiker.Note.OutWiker.ParamManager.Group getGroup(java.lang.String key) {
    if (key == null)
        return null;
    
    for (by.anzak.notewiker.Note.OutWiker.ParamManager.Group g : groups) {
        if (key.equals(g.key))
            return g;
        
    }
    by.anzak.notewiker.Note.OutWiker.ParamManager.Group g = new by.anzak.notewiker.Note.OutWiker.ParamManager.Group();
    groups.add(g);
    return g;
}