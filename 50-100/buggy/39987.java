@java.lang.Override
public void onEventComing(cn.edu.jxnu.awesome_campus.event.EventModel eventModel) {
    super.onEventComing(eventModel);
    java.util.List list = eventModel.getDataList();
    switch (eventModel.getEventCode()) {
        case cn.edu.jxnu.awesome_campus.event.EVENT.CAMPUS_NEWS_REFRESH_SUCCESS :
            adapter.newList(list);
            hideLoading();
            android.util.Log.d("fragment", "success");
            break;
        case cn.edu.jxnu.awesome_campus.event.EVENT.CAMPUS_NEWS_REFRESH_FAILURE :
            android.util.Log.d("fragment", "fail");
            break;
    }
}