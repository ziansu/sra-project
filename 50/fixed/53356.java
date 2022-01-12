void clearBookmarks() {
    if ((bookmarks.size()) == 0)
        return ;
    
    optionsMenu.remove(((optionsMenu.getComponentCount()) - 1));
    bookmarks.clear();
}