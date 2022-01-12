@java.lang.Override
public void onClick(android.view.View v) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.ICE_CREAM_SANDWICH)) {
        activityTitle.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }else
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) {
            activityTitle.setSystemUiVisibility(View.STATUS_BAR_HIDDEN);
        }
    
    postNewReviewIv.setVisibility(View.GONE);
    activityTitle.setOnClickListener(activityTitleListenerShow);
}