public boolean hasErrors() {
    if (!(mFormErrors.isEmpty()))
        return true;
    
    for (snap.forms.FormField field : mFieldList)
        if (field.hasError())
            return true;
        
    
    return false;
}