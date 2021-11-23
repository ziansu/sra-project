public void checkTdProdCode() {
    java.lang.System.out.println(getTdProf().getEncTdProdCode());
    getMessage().message(("Prod code: " + (getTdProf().getEncTdProdCode())));
    if (getTdProf().getEncTdProdCode().equals("1")) {
        getTdProf().setEncTerm(0);
        getTdProf().setEncRegularTD(true);
    }else {
        getTdProf().setEncTerm(0);
        getTdProf().setEncRegularTD(false);
    }
    setTerms();
}