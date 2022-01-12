@java.lang.Override
public void onBindViewHolder(com.blstream.studybox.decks_view.DecksAdapter.ViewHolder holder, int position) {
    holder.deckTitle.setText(decksList.getDecks().get(position).getDeckName());
    holder.questionsQuantity.setText(java.lang.String.valueOf(decksList.getDecks().get(position).getNoOfQuestions()));
    holder.quantityIcon.setImageResource(R.drawable.ic_questions);
}