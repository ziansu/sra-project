private void bindName(de.ironjan.mensaupb.adapters.TextView view, de.ironjan.mensaupb.adapters.Cursor cursor, int columnIndex) {
    boolean isEnglish = java.util.Locale.getDefault().getLanguage().startsWith(java.util.Locale.ENGLISH.toString());
    final java.lang.String name;
    if (isEnglish) {
        name = cursor.getString(MenuListingAdapter.NAME_EN_INDEX);
    }else {
        name = cursor.getString(MenuListingAdapter.NAME_DE_INDEX);
    }
    view.setText(name);
}