public void render() {
    for (int y = 8; y >= 1; y--) {
        for (int x = 1; x <= 8; x++) {
            java.lang.System.out.print(((" " + (renderGamepiece(x, y))) + " "));
        }
        java.lang.System.out.println("");
    }
}