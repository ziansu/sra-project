@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }else
        if (o == null) {
            return false;
        }else
            if (!(this.getClass().equals(o.getClass()))) {
                return false;
            }
        
    
    edu.chl.mailbowser.presenters.contactbook.ContactListItem other = ((edu.chl.mailbowser.presenters.contactbook.ContactListItem) (o));
    return contact.equals(other.getContact());
}