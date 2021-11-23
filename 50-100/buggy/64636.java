public void setSelectedIndices(java.util.Set<java.lang.Integer> indices, boolean notify) {
    java.util.Set<java.lang.Integer> oldSelectedIndecies = selectorModel.getSelectedIndices();
    java.util.Set<java.lang.Integer> newSelectedIndecies = indices;
    java.lang.Object oldValue = getSelectedValues();
    selectorModel.setSelectedIndices(indices);
    if (notify && (!(oldSelectedIndecies.equals(newSelectedIndecies)))) {
        java.lang.Object newValue = getSelectedValues();
        notifyEventListeners(net.abstractfactory.plum.view.component.EVENT_STATE_CHANGE);
        notifyEventListeners(net.abstractfactory.plum.view.component.EVENT_VALUE_CHANGE, oldValue, newValue);
    }
}