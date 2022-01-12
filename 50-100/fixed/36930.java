@java.lang.Override
public void onClick(android.view.View v) {
    int x = sb.getSpanStart(this);
    java.lang.System.out.print((("\npressed! x: " + x) + "\n"));
    MainActivity.cursor.setX(x);
    dcheungaa.procal.InputHandler.cursorPos = final_index;
    dcheungaa.procal.CursorHandler.locate(((dcheungaa.procal.InputHandler.cursorPos) - 1));
}