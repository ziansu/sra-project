public java.lang.String Login() {
    PersonID = SingletonDBMgr.getPersonID(neptun, password);
    java.lang.System.out.println(("PERSZONID: " + (PersonID)));
    if ((PersonID) != 0)
        return "SIKERES BELÉPÉS";
    
    return "SIKERTELEN BELÉPÉS";
}