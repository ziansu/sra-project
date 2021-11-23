@java.lang.Override
public void onBindViewHolder(com.watermelonfueled.basiccards.CardListViewAdapter.CardListViewHolder holder, int position) {
    holder.imagePath = cardImageList.get(position, null);
    new com.watermelonfueled.basiccards.CardListViewAdapter.GetImageAsyncTask().execute(holder);
    holder.front.setText(cardFrontList.get(position));
    holder.back.setText(cardBackList.get(position));
}