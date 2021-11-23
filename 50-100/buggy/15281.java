public void doubleClick(org.eclipse.jface.viewers.DoubleClickEvent event) {
    org.eclipse.jface.viewers.IStructuredSelection sel = ((org.eclipse.jface.viewers.IStructuredSelection) (event.getSelection()));
    java.lang.Object clicked = sel.getFirstElement();
    if (clicked instanceof org.springframework.ide.eclipse.boot.dash.model.requestmappings.RequestMapping) {
        org.springframework.ide.eclipse.boot.dash.model.requestmappings.RequestMapping rm = ((org.springframework.ide.eclipse.boot.dash.model.requestmappings.RequestMapping) (clicked));
        java.lang.String url = org.springframework.ide.eclipse.boot.dash.model.BootDashElementUtil.getUrl(input, rm);
        if (url != null) {
            org.springsource.ide.eclipse.commons.ui.UiUtil.openUrl(url);
        }
    }
}