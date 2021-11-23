public void logout(android.view.View view) {
    getSharedPreferences(com.github.oryanmat.trellowidget.TrelloWidget.INTERNAL_PREFS, Context.MODE_PRIVATE).edit().remove(TrelloAPIUtil.TOKEN_PREF_KEY).commit();
    replaceFragment(new com.github.oryanmat.trellowidget.activity.LoginFragment());
}