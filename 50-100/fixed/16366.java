@java.lang.Override
public void onBindViewHolder(com.iot.petsfinder.HomeContentFragment.ViewHolder holder, int position) {
    holder.image.setImageDrawable(image[(position % (image.length))]);
    holder.type.setText(type[(position % (type.length))]);
    holder.age.setText(age[(position % (age.length))]);
    holder.gender.setText(gender[(position % (gender.length))]);
}