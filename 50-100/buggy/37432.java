public void bind(com.shakeup.nytimemachine.commons.models.Article article) {
    headline.setText(article.getHeadline());
    snippet.setText(article.getSnippet());
    if (article.hasImages()) {
        java.lang.String imgUrl = article.getImgUrlWide();
        com.squareup.picasso.Picasso.with(imageView.getContext()).setLoggingEnabled(true);
        com.squareup.picasso.Picasso.with(imageView.getContext()).load(imgUrl).into(imageView);
    }
}