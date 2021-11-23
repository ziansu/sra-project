public void onDeckClicked(int position, android.view.View view) {
    android.content.Context context = view.getContext();
    android.content.Intent intent = new android.content.Intent(context, com.blstream.studybox.activities.ExamActivity.class);
    intent.putExtra(context.getString(R.string.deck_data_key), dataHelper.getSingleDeck(position));
    context.startActivity(intent);
}