@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    java.lang.String is = v.getText().toString();
    j = java.lang.Integer.parseInt(is);
    endy = (endy) - (j);
    canvas.drawLine(startx, starty, endx, endy, paint);
    starty = endy;
    return false;
}