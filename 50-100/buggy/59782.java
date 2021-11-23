private void buildTabLocalitaOggetto() {
    this.localitaOggettoMissioneForm = ILocalitaOggettoMissioneForm.LocalitaOggettoMissioneForm.getDatiPeriodoMissioneForm().withBean(bean).withIsAdmin(isAdmin).withEnabled(enabled).withIsVisible(bean.isMissioneEstera()).withModifica(modifica).build();
    detailsWrapper.addComponent(buildTab("Localita\\Oggetto", FontAwesome.SUITCASE, this.localitaOggettoMissioneForm));
}