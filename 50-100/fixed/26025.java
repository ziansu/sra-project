@java.lang.Override
public void onBindViewHolder(cat.udl.menufinder.adapters.MenusAdapter.ViewHolder holder, final int position) {
    final cat.udl.menufinder.models.Menu menu = getMenu(position);
    holder.name.setText(menu.getName());
    holder.price.setText(java.lang.String.valueOf(menu.getPrice()));
    if ((userType) != (cat.udl.menufinder.enums.UserType.RESTAURANT))
        holder.is_visible.setVisibility(android.view.View.GONE);
    
    holder.is_visible.setChecked(menu.isVisible());
}