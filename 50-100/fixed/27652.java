public void notifyObservers(org.openflexo.fge.notifications.FGENotification notification) {
    if ((!(notification instanceof org.openflexo.fge.notifications.NodeDeleted)) && (isDeleted())) {
        org.openflexo.fge.impl.DrawingTreeNodeImpl.logger.warning("notifyObservers() called by a deleted DrawingTreeNode");
        return ;
    }
    getPropertyChangeSupport().firePropertyChange(notification.propertyName(), notification.oldValue, notification.newValue);
}