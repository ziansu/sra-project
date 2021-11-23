private void id() {
    Token current = tokenList.get(0);
    if ((current.value()) == (TokId.TIDNT)) {
        java.lang.System.out.println(tokenList.get(0));
        tokenList.remove(0);
    }
}