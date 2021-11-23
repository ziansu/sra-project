public mjc.gc.METHODE chercherLocalementMethod(java.lang.String n, mjc.gc.ARGLIST arg) {
    mjc.gc.LMETHODE lm = this.hmMethode.get(n);
    if (lm == null) {
        return null;
    }else {
        return lm.getMethod(arg);
    }
}