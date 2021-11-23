@java.lang.Override
public java.awt.Component add(java.awt.Component comp) {
    if (!(comp instanceof robokill.Bar))
        elements.add(((robokill.Element) (comp)));
    
    return super.add(comp);
}