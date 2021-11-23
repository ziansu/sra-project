@java.lang.Override
protected org.xblackcat.idea.favorites.FavoriteFolder editItem(@org.jetbrains.annotations.Nullable
org.xblackcat.idea.favorites.FavoriteFolder o) {
    org.xblackcat.idea.favorites.FavoriteFolderChooser dialog = org.xblackcat.idea.favorites.Utils.selectFolder(o, favoritesPanel, project);
    if (dialog == null) {
        return null;
    }
    setModified(true);
    return dialog.getSelectedFolder();
}