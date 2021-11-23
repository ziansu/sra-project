@java.lang.Override
public void onBindViewHolder(tw.edu.ncku.igem.eduncku.Achievement.MyAdapter.ViewHolder holder, int position) {
    holder.mTextView.setText(mData.get(position));
    if ((MainActivity.Achievement_array.get(position)) == true) {
        holder.mCardView.setCardBackgroundColor(android.graphics.Color.parseColor("#B8F1CC"));
    }
}