private void initialToolBar() {
    org.eclipse.jface.action.IToolBarManager man = getViewSite().getActionBars().getToolBarManager();
    if (!(XMLReader.DEFAULT_XMLCONFIG.equals(m_fileName))) {
        man.add(new org.eclipse.jface.action.Action("Save", scouter.client.util.ImageUtil.getImageDescriptor(Images.save)) {
            public void run() {
                saveConfigurations();
            }
        });
    }
    man.add(new org.eclipse.jface.action.Action("SaveAs", scouter.client.util.ImageUtil.getImageDescriptor(Images.saveas)) {
        public void run() {
            saveAsConfigurations();
        }
    });
}