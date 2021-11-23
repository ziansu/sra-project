private void addReviewView(com.example.popularmovies.data.Review review) {
    android.view.View reviewView = getActivity().getLayoutInflater().inflate(R.layout.item_review, null);
    ((android.widget.TextView) (reviewView.findViewById(R.id.review_content))).setText(review.content);
    ((android.widget.TextView) (reviewView.findViewById(R.id.review_author))).setText(("Author: " + (review.author)));
    mReviewContainer.addView(reviewView);
}