public boolean var() {
    match();
    if (currentToken.getName().equals("WS")) {
        match();
    }
    return currentToken.getName().equals("VAR");
}