@java.lang.Override
protected boolean authenticate(java.lang.String username, java.lang.String passwordhash) {
    boolean retval = false;
    ae.reit.traq.model.Systemusers s = u.getuserbyCredentials(username, passwordhash);
    if (s != null)
        if ((s.getLocked()) != 'Y')
            retval = true;
        
    
    return retval;
}