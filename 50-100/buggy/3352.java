public void run() {
    javax.swing.JFrame frame = ((javax.swing.JFrame) (org.openide.windows.WindowManager.getDefault().getMainWindow()));
    java.lang.String title = frame.getTitle();
    title = ((title.substring(0, ((title.indexOf('-')) - 1))) + " - ") + SaveAsFileName;
    frame.setTitle(title);
}