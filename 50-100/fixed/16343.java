public static synchronized void set(io.github.UltimateBrowserProject.Browser.AlbumController controller, int index) {
    if ((((io.github.UltimateBrowserProject.Browser.BrowserContainer.list.size()) - 1) >= index) && ((io.github.UltimateBrowserProject.Browser.BrowserContainer.list.get(index)) instanceof io.github.UltimateBrowserProject.View.UltimateBrowserProjectWebView))
        ((io.github.UltimateBrowserProject.View.UltimateBrowserProjectWebView) (io.github.UltimateBrowserProject.Browser.BrowserContainer.list.get(index))).destroy();
    
    io.github.UltimateBrowserProject.Browser.BrowserContainer.list.set(index, controller);
}