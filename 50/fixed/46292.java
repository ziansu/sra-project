public boolean canEdit() {
    return (userBean.getUser().getAdminlevel()) >= (selectedPJ.getStare());
}