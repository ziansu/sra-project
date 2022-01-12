@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (client.facade.CatanFacade.isDiscarding()) {
        startDiscard();
    }
}