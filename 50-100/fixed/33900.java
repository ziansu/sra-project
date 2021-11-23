private void setOrt(java.lang.String ort) throws exceptions.UngueltigeEingabeException {
    if (ort == null) {
        throw new java.lang.NullPointerException("Kein Ort vorhanden!");
    }else
        if ((ort.length()) < 3) {
            throw new exceptions.UngueltigeEingabeException("Bitte geben Sie mindestens 3 Zeichen als Ort ein!");
        }else {
            this.ort = ort;
        }
    
}