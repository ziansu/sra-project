@java.lang.Override
public void onBindViewHolder(org.dreamitcodeit.storyteller.models.SearchLocationAdapter.ViewHolder holder, int position) {
    android.location.Address currLoc = locations.get(position);
    holder.currentLoc = currLoc;
    holder.tvTitle.setText(currLoc.getAddressLine(0));
    holder.tvAuthorName.setText(currLoc.getCountryName());
    holder.tvDate.setText("");
    holder.tvFavorites.setText("");
    holder.tvStoryBody.setText("");
    holder.ivFavoriteIcon.setVisibility(View.INVISIBLE);
}