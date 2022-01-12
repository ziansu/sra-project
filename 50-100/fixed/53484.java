private void drawBeacons(android.graphics.Canvas canvas) {
    for (double[] beaconCoords : this.beaconsCoords) {
        float[] beaconMapCoords = translateCoords(beaconCoords);
        canvas.drawCircle(beaconMapCoords[0], beaconMapCoords[1], 25, beaconPaint);
    }
}