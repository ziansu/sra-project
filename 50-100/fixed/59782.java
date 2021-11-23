private void buildTabLocalitaOggetto() {
    this.localitaOggettoMissioneForm = ILocalitaOggettoMissioneForm.LocalitaOggettoMissioneForm.getDatiPeriodoMissioneForm().withBean(bean).withIsAdmin(isAdmin).withEnabled(enabled).withModifica(modifica).build().withIsVisible(bean.isMissioneEstera());
    detailsWrapper.addComponent(buildTab("Localita\\Oggetto", FontAwesome.SUITCASE, this.localitaOggettoMissioneForm));
}