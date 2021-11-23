@java.lang.Override
public void onBindViewHolder(com.iot.petsfinder.HomeContentFragment.ViewHolder holder, int position) {
    holder.image.setImageDrawable(image[(position % (image.length))]);
    holder.type.setText(type.get((position % (type.size()))));
    holder.age.setText(age.get((position % (age.size()))));
    holder.gender.setText(gender.get((position % (gender.size()))));
}