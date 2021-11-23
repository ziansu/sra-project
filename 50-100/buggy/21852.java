@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    java.lang.String evtName = evt.getPropertyName();
    edu.chl.calendarplusplus.model.IContactGroup cg = ((edu.chl.calendarplusplus.model.IContactGroup) (evt.getNewValue()));
    if (evtName.equalsIgnoreCase("EditContractGroupClicked")) {
        java.lang.System.out.println("Edit ContactGroup Clicked.");
    }
    if (evtName.equalsIgnoreCase("RemoveContactGroupClicked")) {
        java.lang.System.out.println("Remove ContractGroup Clicked.");
    }
}