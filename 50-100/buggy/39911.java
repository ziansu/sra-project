public void listenerForRatingBar() {
    rating_b = ((android.widget.RatingBar) (findViewById(R.id.ratingBar)));
    text_v = ((android.widget.TextView) (findViewById(R.id.numRating)));
    rating_b.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener() {
        @java.lang.Override
        public void onRatingChanged(android.widget.RatingBar ratingBar, float rating, boolean fromUser) {
            text_v.setText(java.lang.String.valueOf(rating));
        }
    });
}