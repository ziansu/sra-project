public void showMenu(int menuId, final android.view.View from) {
    if ((showContextMenu(menuId, from)) == null)
        if ((menuId == (R.menu.main_menu)) || (menuId == (R.id.title_menu)))
            openOptionsMenu();
        else
            if (menuId == (R.id.menu_sort))
                showMenu(R.menu.menu_sort, from);
            else
                if (menuId == (R.id.menu_view))
                    showMenu(R.menu.menu_view, from);
                
            
        
    
}