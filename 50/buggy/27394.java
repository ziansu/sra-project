@java.lang.Override
public void newField(java.util.Deque<java.lang.Object> formVals) {
    if ((model.getFilePath()) != null) {
        menuController.save();
    }
    model.clear();
    editForm(formVals);
}