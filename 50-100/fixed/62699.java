@java.lang.Override
public boolean checkAdmin(java.lang.String email, java.lang.String password) {
    java.util.List<entity.Administrator> listaAdmin = administratorFacade.findAll();
    for (entity.Administrator adm : listaAdmin) {
        if ((adm.getEmail().equalsIgnoreCase(email)) && (adm.getPassword().equals(password))) {
            return true;
        }
    }
    return false;
}