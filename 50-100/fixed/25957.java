public void checkTdProdCode() {
    if (getTdProf().getEncTdProdCode().equals("1")) {
        getTdProf().setEncTerm(0);
        getTdProf().setEncRegularTD(true);
    }else {
        getTdProf().setEncTerm(0);
        getTdProf().setEncRegularTD(false);
    }
    setTerms();
}