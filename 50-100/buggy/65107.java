@java.lang.Override
public void notifySkinUpdate() {
    base.util.ViewUtil.sDefaultDrawable = null;
    de.greenrobot.event.EventBus.getDefault().post(new com.manager.entity.SkinChangeEvent());
    if ((skinObservers) == null)
        return ;
    
    for (com.manager.listener.ISkinUpdate observer : skinObservers) {
        observer.onThemeUpdate();
    }
}