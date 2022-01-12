@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    clear_buttons();
    set_selected_block(0, false);
    Button_Takeoff.setSelected(true);
    return false;
}