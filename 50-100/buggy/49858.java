@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        titleView.setText(data.getStringExtra("title"));
        ratingView.setText(data.getStringExtra("rating"));
        plotView.setText(data.getStringExtra("plot"));
        yearView.setText(data.getStringExtra("year"));
        java.lang.System.out.println(data.getStringExtra("genre"));
        genreView.setText(data.getStringExtra("genre"));
    }
}