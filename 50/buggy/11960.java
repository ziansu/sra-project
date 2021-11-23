@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    java.lang.System.out.println("Updating the discard controller");
    if (client.facade.CatanFacade.isDiscarding()) {
        startDiscard();
    }else {
    }
}