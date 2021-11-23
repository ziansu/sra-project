@java.lang.Override
public void dispose() {
    super.dispose();
    com.xeranas.lkj.util.AudioUtils.cleanUp();
    rayHandler.dispose();
    world.dispose();
    backgroundImg.dispose();
    map.dispose();
    tmr.dispose();
    player.dispose();
}