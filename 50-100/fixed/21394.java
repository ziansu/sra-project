@java.lang.Override
public void handleAction(java.lang.Object sender, java.lang.Object target) {
    if (ok.isEnabled()) {
        if ((getParent()) != null) {
            close();
        }
        logic.onOkButtonClicked(((java.lang.Long) (taskTree.getValue())));
    }else
        if ((target == (taskTree)) && ((taskTree.getValue()) != null)) {
            taskTree.expandItem(taskTree.getValue());
        }
    
}