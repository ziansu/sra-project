public boolean numeroAutomórfico() {
    boolean automorfico;
    automorfico = false;
    int cuadrado = (numeroAutomorfico) * (numeroAutomorfico);
    if (((numeroAutomorfico) == ((square) % 100)) || ((numeroAutomorfico) == ((square) % 10)))
        automorfico = true;
    else {
        automorfico = false;
    }
    return automorfico;
}