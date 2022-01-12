private javagames.render.DisplayModeExample.DisplayModeWrapper[] listDisplayModes() {
    java.util.ArrayList<javagames.render.DisplayModeExample.DisplayModeWrapper> list = new java.util.ArrayList<javagames.render.DisplayModeExample.DisplayModeWrapper>();
    for (java.awt.DisplayMode mode : graphicsDevice.getDisplayModes()) {
        javagames.render.DisplayModeExample.DisplayModeWrapper wrap = new javagames.render.DisplayModeExample.DisplayModeWrapper(mode);
        if (!(list.contains(wrap))) {
            list.add(wrap);
        }
    }
    return list.toArray(new javagames.render.DisplayModeExample.DisplayModeWrapper[0]);
}