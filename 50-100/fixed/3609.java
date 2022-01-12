@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (object instanceof lasad.gwt.client.model.organization.OrganizerLink) {
        lasad.gwt.client.model.organization.OrganizerLink link = ((lasad.gwt.client.model.organization.OrganizerLink) (object));
        if (((startBox.equals(link.getStartBox())) && (endBox.equals(link.getEndBox()))) && (link.getType().equalsIgnoreCase(type))) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}