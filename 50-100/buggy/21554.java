public void iconWasSelected(application_componentview.SMTComponent source) {
    application_componentview.SMTComponent[] components = new application_componentview.SMTComponent[]{ select , nonDestination , destination , link };
    for (application_componentview.SMTComponent c : components)
        if (c != source)
            c.unselect();
        
    
    editor.componentSelectionDidChange(source.getComponentType());
}