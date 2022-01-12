public void dealCard() {
    dealCard = com.example.guanqing.solblackjack.Game.GameActivityFragment.deck.deal();
    dealCardDrawable = getActivity().getResources().getDrawable(com.example.guanqing.solblackjack.Utility.Utilities.getCardDrawableResId(dealCard));
    deal.setImageResource(com.example.guanqing.solblackjack.Utility.Utilities.getCardDrawableResId(dealCard));
    deal.setVisibility(View.VISIBLE);
}