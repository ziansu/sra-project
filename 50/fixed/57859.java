public java.lang.String saveTeam() {
    teamViewBean.saveTeam();
    return "/teams?faces-redirect=true";
}