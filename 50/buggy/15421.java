@org.junit.After
public void cleanGM() {
    this.getGameModelFacade().remove(getGameModel().getId());
    cleanData();
}