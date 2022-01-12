private void openGenerateModal(java.lang.String site, java.lang.String login, java.lang.String password) throws java.lang.InterruptedException {
    com.acme.PasswordHelper.PasswordCreationModalHelper modal = _passwordHelper.openPasswordCreationModal();
    modal.findSiteElement().sendKeys(site);
    modal.findLoginElement().sendKeys(login);
    if (password != null)
        modal.findPasswordElement().sendKeys(password);
    
    clickGenerateButtonFromCreate();
}