public void setFather(com.cdbs.oegen.data.Person newValue) {
    if ((father) == newValue)
        return ;
    
    if ((father) != null) {
        father.children.removeElement(this);
    }
    com.cdbs.oegen.data.Person oldValue = father;
    father = newValue;
    pcs.firePropertyChange(com.cdbs.oegen.data.Person.PROPERTY_FATHER, oldValue, newValue);
    father.children.addElement(this);
    father.children.stateChanged(new javax.swing.event.ChangeEvent(this));
    com.cdbs.oegen.data.Person.persons.stateChanged(new javax.swing.event.ChangeEvent(this));
}