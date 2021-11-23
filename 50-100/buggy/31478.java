public boolean speichereStats(valueobjects.Stats s) throws java.io.IOException {
    this.schreibeDaten(new java.lang.Integer(s.getArklnummer()).toString());
    this.schreibeDaten(s.getAtklname());
    this.schreibeDaten(new java.lang.Integer(s.getBestand()).toString());
    this.schreibeDaten(s.getDatum());
    this.schreibeDaten(new java.lang.String(s.getType()).toString());
    return true;
}