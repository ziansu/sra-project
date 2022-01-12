public boolean anmelden(java.lang.String name, java.lang.String passwort) {
    name.toLowerCase();
    if (dao.isIn(((name + ";") + passwort)))
        return true;
    
    return false;
}