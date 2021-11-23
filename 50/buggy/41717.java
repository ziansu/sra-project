@java.lang.Override
public void onClick(android.view.View v) {
    postNewReviewIv.setVisibility(View.VISIBLE);
    activityTitle.setOnClickListener(activityTitleListenerHide);
}