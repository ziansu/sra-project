@java.lang.Override
public void onClick(android.view.View view) {
    if (com.nos.ploy.utils.RecyclerUtils.isAvailableData(menus, holder.getAdapterPosition())) {
        @com.nos.ploy.DrawerController.Menu
        int menu = menus.get(holder.getAdapterPosition()).getMenu();
        listener.onMenuItemSelected(menu);
        com.nos.ploy.DrawerController.closeDrawer(drawerLayout);
    }
}