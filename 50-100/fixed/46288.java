@java.lang.Override
public boolean bloccaLocatore(long oid, boolean bloccato) {
    entity.Locatore loc = this.locatoreFacade.find(oid);
    boolean result = false;
    if ((loc != null) && ((loc.isBloccato()) != bloccato)) {
        loc.setBloccato(bloccato);
        this.locatoreFacade.edit(loc);
        result = true;
    }
    return result;
}