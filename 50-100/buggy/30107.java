@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
    canvas.drawText("o", FOEX, FOEY, paintRed);
    canvas.drawText(getContext().getString(R.string.ttc_info, TTC), com.app.carcontrol.widget.InfoView.TXT_MARGIN_HOR, com.app.carcontrol.widget.InfoView.TXT_MARGIN_VER, paintYellow);
    canvas.drawText(getContext().getString(R.string.foe_info, FOEX, FOEY), com.app.carcontrol.widget.InfoView.TXT_MARGIN_HOR, ((com.app.carcontrol.widget.InfoView.TXT_MARGIN_VER) * 2), paintYellow);
}