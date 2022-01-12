@java.lang.Override
public void selectionChange(com.vaadin.event.selection.SelectionEvent<data.UserDto> event) {
    java.util.Optional<data.UserDto> userSelected = event.getFirstSelectedItem();
    java.util.List<data.NfcTagDto> nfcs = userSelected.get().getNfcTags();
    if ((nfcs.size()) > 0)
        nfcData.setItems(nfcs);
    else
        nfcData.setItems(new java.util.ArrayList<>());
    
}