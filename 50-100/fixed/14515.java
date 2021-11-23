private void initAgenda() {
    this.agendaPresenter = new com.thoughtworks.mobile.awayday.presenter.AgendaPresenter(agendaScreen);
    com.thoughtworks.mobile.awayday.factory.AgendaItemBuilder localAgendaItemBuilder = new com.thoughtworks.mobile.awayday.factory.AgendaItemBuilder(getActivity());
    localAgendaItemBuilder.setAgendaItemActionClickedListener(this);
    localAgendaItemBuilder.setAgenItemViewStateRecorder(this.agendaPresenter);
    agendaScreen.initComponent(localAgendaItemBuilder, this.agendaPresenter);
}