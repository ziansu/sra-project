@java.lang.Override
public void next_2_video() {
    mPosition = position_thumb_2;
    controller.setEndTime(0);
    player.stop();
    player.reset();
}