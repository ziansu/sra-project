public static void disposeWindow() {
    if ((net.sf.memoranda.ui.App.frame) == null)
        return ;
    
    net.sf.memoranda.ui.App.frame.dispose();
}