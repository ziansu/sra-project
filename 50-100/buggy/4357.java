private android.graphics.PointF TranslatePlayerPos(onebit.o_zonesflight.Player player, android.graphics.Bitmap display) {
    return new android.graphics.PointF((((player.GetPosition()) / (Settings.Environment_Width)) * ((display.getWidth()) - (oZone.getWidth()))), ((display.getHeight()) - (oZone.getHeight())));
}