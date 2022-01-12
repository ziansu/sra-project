@java.lang.Override
public void addItem(com.wegas.mcq.persistence.ChoiceDescriptor item) {
    this.getItems().add(item);
    item.setQuestion(this);
    if ((this.getGameModel()) != null) {
        this.getGameModel().addToVariableDescriptors(item);
    }
}