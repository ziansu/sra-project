public void onGlobalVariableChange(java.lang.String variable) {
    widgets.clear();
    initGui();
    for (pneumaticCraft.common.remote.ActionWidget actionWidget : remoteLayout.getActionWidgets()) {
        if ((actionWidget instanceof pneumaticCraft.common.remote.ActionWidgetVariable) && (((pneumaticCraft.common.remote.ActionWidgetVariable) (actionWidget)).getVariableName().equals(variable))) {
            ((pneumaticCraft.common.remote.ActionWidgetVariable) (actionWidget)).onVariableChange();
        }
    }
}