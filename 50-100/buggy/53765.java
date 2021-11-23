@java.lang.Override
public void handleMessage(android.os.Message msg) {
    com.laudandjolynn.mytv.MainActivity activity = ctx.get();
    if (activity != null) {
        if ((((com.laudandjolynn.mytv.utils.AppUtils.DISMISS_PROGRESS_DIALOG) == (msg.what)) && ((activity.pbDialog) != null)) && (activity.pbDialog.isShowing())) {
            activity.pbDialog.dismiss();
        }else
            if ((com.laudandjolynn.mytv.utils.AppUtils.READY_TO_LOAD_DATA) == (msg.what)) {
                activity.loadData();
            }
        
    }
}