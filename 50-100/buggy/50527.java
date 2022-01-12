@java.lang.Override
public void onClick(android.view.View view) {
    if ((holder.mDescriptionReviewTextView.getMaxLines()) == (java.lang.Integer.MAX_VALUE)) {
        android.support.transition.TransitionManager.beginDelayedTransition(holder.mContentLayout);
        holder.mReadMoreClickableTextView.setText("Read more");
        holder.mDescriptionReviewTextView.setMaxLines(5);
        notifyDataSetChanged();
    }else {
        android.support.transition.TransitionManager.beginDelayedTransition(holder.mContentLayout);
        holder.mReadMoreClickableTextView.setText("Hide");
        holder.mDescriptionReviewTextView.setMaxLines(java.lang.Integer.MAX_VALUE);
        notifyDataSetChanged();
    }
}