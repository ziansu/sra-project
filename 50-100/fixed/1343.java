@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN, sticky = true)
public void onMessageEvent(ixigo.example.apple.ixigohack.eventBus.FirebaseEventBus.OnFirebaseEventAdded obj) {
    if ((((obj != null) && ((obj.getData()) != null)) && ((obj.getData().getDayPos()) == (position))) && (ixigo.example.apple.ixigohack.utils.AndroidUtils.compareString(obj.getData().getPlaceId(), placeId))) {
        if ((adapter) != null) {
        }
    }
}