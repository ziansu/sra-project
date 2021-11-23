@java.lang.Override
public void onBindViewHolder(com.example.jose.updated.view.PageViewHolder holder, int position) {
    com.example.jose.updated.model.Page page = listOfPages.get(position);
    holder.bind(page);
    setAnimation(holder.itemView, position);
    super.onBindViewHolder(holder, position);
}