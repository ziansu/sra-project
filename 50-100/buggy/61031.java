public void fieldChanged(net.rim.device.api.ui.Field field, int arg1) {
    for (int index = 0; index < (_listItems.length); index++) {
        if (_listItems[index].isSelected()) {
            _response.addElement(new java.lang.Integer(_listItems[index].getIndex()));
        }
    }
    close(true);
}