@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    java.lang.String evtName = evt.getPropertyName();
    if (evtName.equalsIgnoreCase("EditContractGroupClicked")) {
        edu.chl.calendarplusplus.model.IContactGroup cg = ((edu.chl.calendarplusplus.model.IContactGroup) (evt.getNewValue()));
        java.lang.System.out.println("Edit ContactGroup Clicked.");
    }
    if (evtName.equalsIgnoreCase("RemoveContactGroupClicked")) {
        edu.chl.calendarplusplus.model.IContactGroup cg = ((edu.chl.calendarplusplus.model.IContactGroup) (evt.getNewValue()));
        java.lang.System.out.println("Remove ContractGroup Clicked.");
    }
}