@java.lang.Override
public void onBindViewHolder(a00907981.comp3717.bcit.ca.tabtest.RecipeList.Ingred.ItemAdapter.ViewHolder holder, int position) {
    super.onBindViewHolder(holder, position);
    java.lang.String text = mItemList.get(position).second;
    holder.mText.setText(text);
    holder.itemView.setTag(mItemList.get(position));
}