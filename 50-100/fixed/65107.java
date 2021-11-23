@java.lang.Override
public void notifySkinUpdate() {
    base.util.ViewUtil.sDefaultDrawable = null;
    if ((skinObservers) != null) {
        for (com.manager.listener.ISkinUpdate observer : skinObservers) {
            observer.onThemeUpdate();
        }
    }
    de.greenrobot.event.EventBus.getDefault().post(new com.manager.entity.SkinChangeEvent());
}