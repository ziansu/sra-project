@java.lang.Override
public boolean checkLocatore(java.lang.String email) {
    java.util.List<entity.Locatore> listaLocatori = locatoreFacade.findAll();
    locatore = null;
    for (entity.Locatore l : listaLocatori)
        if (l.getEmail().equalsIgnoreCase(email)) {
            locatore = l;
        }
    
    return (locatore) != null;
}