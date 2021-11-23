public void mouseMove(float delta_x, float delta_y) {
    int mouse_move_x = ((int) (delta_x));
    int mouse_move_y = ((int) (delta_y));
    org.xena.natives.User32.mouse_event(org.xena.plugin.official.ForceAimPlugin.MOUSEEVENTF_MOVE, mouse_move_x, mouse_move_y, 0, null);
}