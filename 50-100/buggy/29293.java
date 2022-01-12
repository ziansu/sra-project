@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    if (error instanceof com.android.volley.NoConnectionError) {
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.example.sklementyev.unimonitor.event.SnackBarMessage(mContext.getString(R.string.errUnknownHost)));
    }else
        if ((error instanceof com.android.volley.ServerError) && ((error.networkResponse.statusCode) == 400)) {
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.example.sklementyev.unimonitor.event.SnackBarMessage(mContext.getString(R.string.errLoginPass)));
        }else {
            org.greenrobot.eventbus.EventBus.getDefault().post(error.getMessage());
        }
    
}