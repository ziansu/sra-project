@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    final com.paolo.fht.vaadin.NodeBrowser nodeBrowser = new com.paolo.fht.vaadin.NodeBrowser("Root browser", "Select root", pathField.getValue(), com.paolo.fht.vaadin.NodeBrowser.BrowserFilter.folder_only_no_hidden);
    com.paolo.fht.vaadin.quick.QuickPopupWindow window = nodeBrowser.show();
    window.addCloseListener(new com.vaadin.ui.Window.CloseListener() {
        private static final long serialVersionUID = 1L;

        @java.lang.Override
        public void windowClose(com.vaadin.ui.Window.CloseEvent e) {
            pathField.setValue(nodeBrowser.getSelectedNode());
        }
    });
    nodeBrowser.getSelectedNode();
}