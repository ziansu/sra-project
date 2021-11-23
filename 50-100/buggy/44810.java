public java.util.List<by.anzak.notewiker.Note.Note> getChildren() {
    java.util.List<java.io.File> lf = getCurrent().getChildren();
    java.util.List<by.anzak.notewiker.Note.Note> ln = new java.util.ArrayList<>();
    for (java.io.File f : lf) {
        ln.add(new by.anzak.notewiker.Note.OutWiker.OutWikerNote(f));
    }
    return ln;
}