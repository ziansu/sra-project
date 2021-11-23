@java.lang.Override
public void enter(com.vaadin.navigator.ViewChangeListener.ViewChangeEvent event) {
    editDrug.setEnabled(false);
    deleteDrug.setEnabled(false);
    overviewModel.loadData();
}