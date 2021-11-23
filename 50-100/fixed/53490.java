@java.lang.Override
public void onBindViewHolder(itomer.edu.recyclerviewdemo.MovieViewHolder holder, int position) {
    itomer.edu.recyclerviewdemo.Data item = list.get(position);
    holder.title.setText(item.getTitle());
    holder.description.setText(item.getDescription());
    holder.imageView.setImageResource(item.getImageId());
    if (position != 0)
        animate(holder.itemView);
    
}