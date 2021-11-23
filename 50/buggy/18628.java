private void Warning(com.afollestad.materialdialogs.MaterialDialog.ButtonCallback yesHandler) {
    com.afollestad.materialdialogs.MaterialDialog show = new com.afollestad.materialdialogs.MaterialDialog.Builder(this).title(R.string.warning).content(R.string.no_data).iconAttr(android.R.attr.alertDialogIcon).positiveText(android.R.string.yes).callback(yesHandler).show();
}