private void applysetName() {
    if (values.containsKey("set_name"))
        this.name = ((java.lang.String) (values.get("set_name").value));
    else
        if (values.containsKey("set_name"))
            this.name = ((java.lang.String) (values.get("set").value));
        
    
}