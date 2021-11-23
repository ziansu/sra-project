private void DrawDataPointMarker(float CenterX, float CenterY, android.graphics.Canvas canvas, android.graphics.Paint centerColor) {
    markerColor.setAntiAlias(true);
    markerColor.setStyle(Paint.Style.FILL_AND_STROKE);
    markerColor.setColor(Color.BLACK);
    canvas.drawCircle((CenterX + 1.0F), (CenterY + 1.0F), Dip(4), markerColor);
    canvas.drawCircle((CenterX + 1.0F), (CenterY + 1.0F), Dip(2), centerColor);
}