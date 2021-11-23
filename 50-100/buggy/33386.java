@java.lang.Override
public void cancel() {
    org.openflexo.gina.manager.GinaStackEvent stackElement = GENotifier.notifyMethod();
    if ((_revertBindingValue) != null) {
        if (((_revertBindingValue.getOwner()) != null) && (_revertBindingValue.isValid())) {
            setEditedObject(_revertBindingValue);
        }
    }
    closePopup();
    super.cancel();
    stackElement.end();
}