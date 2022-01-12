private void checkDefaite() throws Modele.Defaite {
    if ((appreciation) <= 0) {
        java.lang.System.out.println((("Le peuple se rebelle ! : Vous avez " + (appreciation)) + " appreciation"));
        throw new Modele.Defaite();
    }
    if ((credits) <= (-10)) {
        java.lang.System.out.println("Vous etes ruine!");
        throw new Modele.Defaite();
    }
}