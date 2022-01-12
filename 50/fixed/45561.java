@java.lang.Override
public void onClick(android.view.View view) {
    if ((gem.com.support_client.screen.feedback.listfeedback.FeedbackAdapter.mListener) != null) {
        gem.com.support_client.screen.feedback.listfeedback.FeedbackAdapter.mListener.onRecyclerViewClick(getLayoutPosition());
    }
}