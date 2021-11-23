public mjc.gc.METHODE chercherLocalementMethod(java.lang.String n, mjc.gc.ARGLIST arg) {
    mjc.gc.LMETHODE lm = this.hmMethode.get(n);
    return lm.getMethod(arg);
}