@java.lang.Override
public void dispose() {
    RPG.maps.loader.dispose();
    RPG.ctrl.msg.dispose();
    if (!(Setting.persistence.cacheResource)) {
        RPG.maps.map.dispose();
        ma.unload(filename);
    }
    if (null != (stackView)) {
        stackView.dispose();
        stackView = null;
        com.rpsg.rpg.system.controller.InputController.currentIOMode = IOMode.MapInput.NORMAL;
    }
    GameViewRes.ray.removeAll();
    parameter.loadedCallback = null;
    parameter = null;
    java.lang.System.gc();
}