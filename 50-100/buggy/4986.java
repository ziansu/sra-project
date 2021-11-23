@java.lang.Override
public void onClick(android.view.View view) {
    initNotification();
    player.start();
    play1button.setVisibility(Button.GONE);
    pause1button.setVisibility(Button.VISIBLE);
    com.gnirt.devotional.MainActivity.x = 1;
    com.gnirt.devotional.MainActivity.y = 1;
    java.lang.System.out.println(((("paly" + (com.gnirt.devotional.MainActivity.x)) + " ") + (com.gnirt.devotional.MainActivity.y)));
}