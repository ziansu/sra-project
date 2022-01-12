@java.lang.Override
public org.jowidgets.api.model.item.IMenuModel editMenu(final org.jowidgets.cap.ui.api.widgets.IBeanTable<BEAN_TYPE> table, final int columnIndex, final org.jowidgets.api.model.item.IMenuModel menuModel) {
    if ((model.getUpdaterService()) == null) {
        return null;
    }else
        if (hasDefaultEditAction) {
            menuModel.addAction(0, editAction);
            return menuModel;
        }else {
            return menuModel;
        }
    
}