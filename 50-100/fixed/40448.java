@java.lang.Override
public void run() {
    if ((gesture.dst(screenX, screenY)) < (MOVE_PX_DIST)) {
        camera.setYaw(0);
        camera.setPitch(0);
        gaia.cu9.ari.gaiaorbit.scenegraph.CelestialBody hit = getBestHit(screenX, screenY);
        if (hit != null) {
            EventManager.instance.post(Events.POPUP_MENU_FOCUS, hit, screenX, screenY);
        }
    }
}