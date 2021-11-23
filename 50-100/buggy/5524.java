public static javax.faces.component.UIComponent resolve(javax.faces.context.FacesContext context, java.lang.String gid) {
    if ((gid == null) || ((gid.charAt(0)) != '#'))
        return null;
    
    return io.tornadofaces.component.util.GlobalId.getGlobalIds(context).get(gid);
}