@java.lang.Override
public void discard() {
    client.model.ClientGame.getGame().DiscardCards(resourceList);
    client.model.ClientGame.getGame().doneDiscarding();
    getDiscardView().closeModal();
    initResourceList();
}