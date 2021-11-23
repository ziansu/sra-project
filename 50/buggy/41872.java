public void moveTo(int x, int y) {
    com.revolverobotics.kubiapi.Kubi kubi = kubiManager.getKubi();
    if (kubi != null) {
        kubi.moveTo(x, y);
    }
}