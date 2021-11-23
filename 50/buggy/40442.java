private void addResourceIfNecessary(javax.faces.component.UIViewRoot root, javax.faces.context.FacesContext context, net.bootsfaces.listeners.InternalIE8CompatiblityLinks output) {
    for (javax.faces.component.UIComponent c : root.getComponentResources(context, "head")) {
        if (c instanceof net.bootsfaces.listeners.InternalIE8CompatiblityLinks)
            return ;
        
    }
    root.addComponentResource(context, output, "head");
}