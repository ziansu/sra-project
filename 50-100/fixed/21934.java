private void bindCategory(de.ironjan.mensaupb.adapters.TextView view, de.ironjan.mensaupb.adapters.Cursor cursor) {
    boolean isEnglish = java.util.Locale.getDefault().getLanguage().startsWith(java.util.Locale.ENGLISH.toString());
    final java.lang.String category;
    if (isEnglish) {
        category = cursor.getString(MenuListingAdapter.CATEGORY_EN_INDEX);
    }else {
        category = cursor.getString(MenuListingAdapter.CATEGORY_DE_INDEX);
    }
    view.setText(category);
}