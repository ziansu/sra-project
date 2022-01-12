public void setInnerXML(android.view.ViewGroup parentView, java.lang.String parentClassName, java.lang.String markup, android.view.View viewRef) {
    if (parentClassName == null)
        parentClassName = parentView.getClass().getName();
    
    setInnerXMLInsertPageFragment(parentView, parentClassName, markup, viewRef);
}