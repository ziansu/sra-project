private void getExtras() {
    android.os.Bundle bundle = getArguments();
    if (bundle != null) {
        keyword = bundle.getString(com.jds.webapp.Fragment.FragmentListArticle.KEY_WORD);
    }
}