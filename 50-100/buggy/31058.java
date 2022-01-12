@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String query = searchBox.getText().toString();
    if (query.isEmpty()) {
        io.github.UltimateBrowserProject.View.UltimateBrowserProjectToast.show(this, R.string.toast_input_empty);
        return ;
    }
    hideSoftInput(searchBox);
    if ((io.github.UltimateBrowserProject.Activity.BrowserActivity.currentAlbumController) instanceof io.github.UltimateBrowserProject.View.UltimateBrowserProjectWebView)
        ((io.github.UltimateBrowserProject.View.UltimateBrowserProjectWebView) (io.github.UltimateBrowserProject.Activity.BrowserActivity.currentAlbumController)).findNext(false);
    
}