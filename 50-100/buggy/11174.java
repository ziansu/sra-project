@java.lang.Override
public void onBindViewHolder(final com.thanhtuan.delivery.adapter.ListNghiemThuAdapter.NghiemThuViewHolder holder, int position) {
    final com.thanhtuan.delivery.model.Photo photo = photos.get(position);
    holder.ibtnIMG.setImageBitmap(photo.getImage());
    holder.txtvLydo.setText(photo.getDescription());
    holder.itemView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            photos.remove(holder.getAdapterPosition());
        }
    });
}