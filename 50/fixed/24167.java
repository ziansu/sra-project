public void globalToast(final java.lang.String text) {
    jwtc.android.chess.ics.Toast t = jwtc.android.chess.ics.Toast.makeText(this, text, Toast.LENGTH_LONG);
    t.setGravity(Gravity.BOTTOM, 0, 0);
    t.show();
}