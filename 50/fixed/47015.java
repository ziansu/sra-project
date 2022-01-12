@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable(augsburg.se.alltagsguide.utilities.ui.BasePageWebViewLanguageActivity.PAGE_STATE, mPage);
    outState.putBoolean(augsburg.se.alltagsguide.utilities.ui.BasePageWebViewLanguageActivity.TRANSLATED_DISMISSED, mTranslatedDismissed);
}