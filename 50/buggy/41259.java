public Beans.Feuerwehr getFeuerwehr(java.lang.String feuerwehrnummer) throws java.lang.Exception {
    Beans.Feuerwehr feuerwehr = new Beans.Feuerwehr(feuerwehrnummer, getNameFuerFubwehr(feuerwehrnummer));
    return feuerwehr;
}