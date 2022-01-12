private void deleteCategory(ch.rmy.android.http_shortcuts.realm.models.Category category) {
    controller.deleteCategory(category);
    showSnackbar(R.string.message_category_deleted);
}