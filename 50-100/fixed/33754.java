public mjc.gc.METHODE chercherGlobalementMethod(java.lang.String n, mjc.gc.ARGLIST arg) {
    mjc.gc.METHODE i = chercherLocalementMethod(n, arg);
    if (i == null)
        if ((this.parente) != null)
            return parente.chercherGlobalementMethod(n, arg);
        
    
    return i;
}