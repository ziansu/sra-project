@java.lang.Override
public void addItem(int index, com.wegas.mcq.persistence.ChoiceDescriptor item) {
    if ((this.getGameModel()) != null) {
        this.getGameModel().addToVariableDescriptors(item);
    }
    this.getItems().add(index, item);
    item.setQuestion(this);
}