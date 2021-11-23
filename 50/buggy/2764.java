private void configureTwitterViewHolder2(com.ga.gradtech.RVAdapter.CardViewHolder vh2, int position) {
    com.ga.gradtech.Card2 card = ((com.ga.gradtech.Card2) (cards.get(position)));
    vh2.mCompanyName.setText("Twitter");
    vh2.mCompanyLocation.setText("Somewhere");
    vh2.mCompanyIcon.setImageResource(R.drawable.twitter_icon);
}