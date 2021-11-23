@java.lang.Override
public void reinitializeButtons() {
    for (com.google.gwt.user.client.ui.Widget widget : getGroupContainerWidget()) {
        org.opencms.ade.containerpage.client.ui.CmsContainerPageElementPanel elemWidget = ((org.opencms.ade.containerpage.client.ui.CmsContainerPageElementPanel) (widget));
        if (getController().requiresOptionBar(elemWidget, elemWidget.getParentTarget())) {
            getController().getContainerpageUtil().addOptionBar(elemWidget);
        }else {
            elemWidget.setElementOptionBar(null);
        }
    }
}