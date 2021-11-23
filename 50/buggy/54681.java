@org.greenrobot.eventbus.Subscribe
public void onEvent(testsample.altvr.com.testsample.events.PhotosEvent event) {
    fetchingItems.setVisibility(View.GONE);
    testsample.altvr.com.testsample.util.LogUtil.log("photos fetch success event");
    updateAdapterDataSet(((java.util.ArrayList<testsample.altvr.com.testsample.vo.PhotoVo>) (event.data)));
}