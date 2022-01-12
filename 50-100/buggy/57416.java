@java.lang.Override
public void onClick(android.view.View view) {
    com.example.eva.kamari.core.MyCard mCard = ((com.example.eva.kamari.core.MyCard) (card));
    if (mCard.isSelected()) {
        mCard.setSelected(false);
        cardView.setCardBackgroundColor(Color.WHITE);
    }else {
        mCard.setSelected(true);
        cardView.setCardBackgroundColor(Color.GREEN);
    }
    itemSelectedListener.onItemSelected(mCard);
}