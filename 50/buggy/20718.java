@java.lang.Override
public void onBindViewHolder(menudroid.aybars.arslan.menudroid.main.RestaurantAdapter.ViewHolder viewHolder, int position) {
    viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
    viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageUrl());
}