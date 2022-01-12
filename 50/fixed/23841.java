public void doubleDown(int i, models.Game g) {
    bet(i);
    g.hit(i);
    stay(g);
}