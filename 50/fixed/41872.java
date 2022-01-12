public void moveTo(float x, float y) {
    com.revolverobotics.kubiapi.Kubi kubi = kubiManager.getKubi();
    if (kubi != null) {
        kubi.moveTo(x, y);
    }
}