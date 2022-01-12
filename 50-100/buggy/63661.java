@java.lang.Override
public void onBindViewHolder(final go.wikipedi.base.ViewWrapper<go.wikipedi.wikipedigo.view.ItemPhotoView> holder, final int position) {
    go.wikipedi.wikipedigo.model.Photo item = getItem(position);
    if (item != null) {
        holder.getView().bind(getItem(position));
        holder.getView().setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View view) {
                onItemSelectedListener.onItemSelected(position);
            }
        });
        if (position == ((itemCount) - 1)) {
            showNextItems();
        }
    }
}