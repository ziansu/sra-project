@java.lang.Override
public void onBindViewHolder(com.ggproject.gustavo.ggram.adapter.PictureAdapterRecyclerView.PictureViewHolder holder, int position) {
    com.ggproject.gustavo.ggram.model.Picture picture = pictures.get(position);
    holder.timeCard.setText(picture.getUserName());
    holder.likeNumberCard.setText(picture.getLikeNumber());
    holder.usernameCard.setText(picture.getUserName());
}