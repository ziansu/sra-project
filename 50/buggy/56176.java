@java.lang.Override
public void setPlace(org.sagebionetworks.web.client.place.ChangeUsername place) {
    this.place = place;
    this.view.setPresenter(this);
    synAlert.clear();
    view.setSynapseAlertWidget(synAlert.asWidget());
}