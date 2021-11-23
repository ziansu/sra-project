public boolean hasErrors() {
    if ((mFormErrors) != null)
        return true;
    
    for (snap.forms.FormField field : mFieldList)
        if (field.hasError())
            return true;
        
    
    return false;
}