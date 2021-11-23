@java.lang.Override
public void onClick(android.view.View v) {
    if ((reviewReviewRecyclerView.getVisibility()) == (android.view.View.VISIBLE)) {
        reviewReviewRecyclerView.setVisibility(View.GONE);
        reviewExpandButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_expand_more));
    }else {
        reviewReviewRecyclerView.setVisibility(View.VISIBLE);
        reviewExpandButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_expand_less));
    }
}