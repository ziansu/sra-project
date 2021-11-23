public it.holls.builders.AutoreBuilder withLibri(java.util.Set<it.holls.model.Libro> libri) {
    if ((this.libri) == null) {
        this.libri = new java.util.HashSet<it.holls.model.Libro>();
    }
    this.libri.addAll(libri);
    return this;
}