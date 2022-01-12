public java.lang.String validateWijzigKlant(final java.lang.String naam, final java.lang.String email) {
    domainapp.dom.klanten.Klant found = klantRepository.findUnique(email);
    if ((email != null) && (found != null)) {
        if (!(found.equals(this))) {
            return "Er is al een klant met dit email adres";
        }
    }
    return null;
}