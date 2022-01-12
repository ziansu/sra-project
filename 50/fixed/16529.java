public static void rightIsPressed(boolean pressed) {
    if (com.geven.headsoccer.screens.play_screen.objects.SpriteHome.collision1) {
        com.geven.headsoccer.screens.play_screen.objects.SpriteHome.rightIsPressed = false;
    }else {
        com.geven.headsoccer.screens.play_screen.objects.SpriteHome.rightIsPressed = pressed;
    }
}