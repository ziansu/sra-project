public boolean numeroAutomórfico() {
    boolean automorfico;
    automorfico = false;
    int cuadrado = (numeroAutomorfico) * (numeroAutomorfico);
    if (((numeroAutomorfico) == (cuadrado % 100)) || ((numeroAutomorfico) == (cuadrado % 10)))
        automorfico = true;
    else {
        automorfico = false;
    }
    return automorfico;
}