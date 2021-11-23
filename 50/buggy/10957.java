@javax.annotation.PostConstruct
public void init() {
    username = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
    logger.debug(("username en cours : " + (username)));
}