@java.lang.Override
public void invoke(java.lang.Boolean isACT) {
    if (isACT) {
        actionMenu.setActionVisible(Action.APPROVE_USER_ACCESS, true);
        actionMenu.setActionEnabled(Action.APPROVE_USER_ACCESS, true);
    }
}