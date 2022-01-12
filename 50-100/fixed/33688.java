private void moveCategory(ch.rmy.android.http_shortcuts.realm.models.Category category, int offset) {
    if (!(canMoveCategory(category, offset))) {
        return ;
    }
    int position = (categories.indexOf(category)) + offset;
    controller.moveCategory(category, position);
}