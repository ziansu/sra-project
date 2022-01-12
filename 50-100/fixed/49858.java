@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        titleView.setText(data.getStringExtra("title"));
        ratingView.setText(data.getStringExtra("rating"));
        plotView.setText(data.getStringExtra("plot"));
        yearView.setText(data.getStringExtra("year"));
        genreView.setText(data.getStringExtra("genre"));
    }
}