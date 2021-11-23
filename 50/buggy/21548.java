@java.lang.Override
public void onWidgetRefreshDelegate(com.mcochin.stockstreaks.pojos.events.WidgetRefreshDelegateEvent event) {
    showProgressWheel();
    de.greenrobot.event.EventBus.getDefault().removeStickyEvent(com.mcochin.stockstreaks.pojos.events.WidgetRefreshDelegateEvent.class);
}