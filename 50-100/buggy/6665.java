private void drawWifi(com.anwesome.games.dataindicationbutton.Canvas canvas, com.anwesome.games.dataindicationbutton.Paint paint) {
    float r = (radius) / 60;
    canvas.drawCircle(0, 0, r, paint);
    for (int i = 1; i <= 3; i++) {
        float newR = r * (i * 10);
        canvas.drawArc(new com.anwesome.games.dataindicationbutton.RectF((-r), (-r), r, r), 240, 60, false, paint);
    }
}