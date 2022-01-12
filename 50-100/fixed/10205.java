@java.lang.Override
public void dispose() {
    super.dispose();
    player.dispose();
    com.xeranas.lkj.util.AudioUtils.cleanUp();
    world.dispose();
    backgroundImg.dispose();
    map.dispose();
    tmr.dispose();
    rayHandler.dispose();
}