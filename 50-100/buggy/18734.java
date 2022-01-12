public static java.lang.String determineQualifiedId(javax.faces.component.UIComponent component) {
    java.lang.String qualifiedId = "";
    if (component instanceof javax.faces.component.NamingContainer)
        qualifiedId = component.getId();
    
    while (((component != null) && (!(component instanceof javax.faces.component.UIViewRoot))) && (!(component instanceof javax.faces.component.UIForm))) {
        component = component.getParent();
        if (component instanceof javax.faces.component.NamingContainer)
            qualifiedId = ((component.getId()) + ":") + qualifiedId;
        
    } 
    return ":" + qualifiedId;
}