@java.lang.Override
public org.jowidgets.api.model.item.IMenuModel editMenu(final org.jowidgets.cap.ui.api.widgets.IBeanTable<BEAN_TYPE> table, final int columnIndex, final org.jowidgets.api.model.item.IMenuModel menuModel) {
    if ((model.getUpdaterService()) == null) {
        return null;
    }else
        if (hasDefaultEditAction) {
            final org.jowidgets.cap.ui.api.table.IBeanTableMenuFactory<BEAN_TYPE> beanTableMenuFactory = org.jowidgets.cap.ui.api.CapUiToolkit.beanTableMenuFactory();
            final org.jowidgets.api.command.IAction editAction = beanTableMenuFactory.editAction(model);
            editMenuModel.addAction(editAction);
            menuModel.addAction(0, editAction);
            return menuModel;
        }else {
            return menuModel;
        }
    
}