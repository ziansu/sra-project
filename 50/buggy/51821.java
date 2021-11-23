public void updateArticleView(int position) {
    mCurrentPosition = position;
    android.widget.TextView textView = ((android.widget.TextView) (getView().findViewById(R.id.article_text)));
    textView.setText(Articles.Articles[position]);
}