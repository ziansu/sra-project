@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putSerializable(augsburg.se.alltagsguide.utilities.ui.BasePageWebViewLanguageActivity.PAGE_STATE, mPage);
    outState.putBoolean(augsburg.se.alltagsguide.utilities.ui.BasePageWebViewLanguageActivity.TRANSLATED_DISMISSED, mTranslatedDismissed);
    super.onSaveInstanceState(outState);
}