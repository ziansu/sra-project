public boolean bloccaLocatore(long oid, boolean bloccato) {
    entity.Locatore loc = this.locatoreFacade.find(oid);
    if ((loc != null) && ((loc.isBloccato()) != bloccato)) {
        loc.setBloccato(bloccato);
        this.locatoreFacade.edit(loc);
    }
    return true;
}