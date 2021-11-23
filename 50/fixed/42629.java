public void agentRedirect() {
    try {
        javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().redirect("agent/profile");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}