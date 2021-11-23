@java.lang.Override
public void onFinish(java.lang.String result) {
    currentHtml = result;
    if ((currentUrl.equals(getString(R.string.link_repository))) && (repoHtml.equals(""))) {
        repoHtml = result;
        showNewScripts();
    }
    progressBar.setVisibility(View.GONE);
    if ((menu) != null)
        onPrepareOptionsMenu(menu);
    
    display();
}