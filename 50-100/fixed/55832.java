private void openModalPanel(org.nocket.gen.page.DMDWebGenPageContext ctx, org.nocket.component.modal.AbstractModalWindow modal, org.apache.wicket.ajax.AjaxRequestTarget target) {
    activeShowModalPanelConfig.showModalPanelParentContext = ctx;
    java.lang.String title = gengui.util.ReflectionUtil.toTitle(activeShowModalPanelConfig.showModalPanel);
    org.apache.wicket.markup.html.panel.Panel panel = activeShowModalPanelConfig.newPanel(org.nocket.gen.page.guiservice.DMDWebGenGuiServiceProvider.WICKET_ID_PANEL_INNER_CONTENT);
    org.nocket.gen.page.guiservice.CloserHandler closerHandler = new org.nocket.gen.page.guiservice.CloserHandler(activeShowModalPanelConfig.showModalPanelParentContext, activeShowModalPanelConfig.hideCloseButton);
    showPanel(modal, panel, title, closerHandler);
    target.add(modal);
}