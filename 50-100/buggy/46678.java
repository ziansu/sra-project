@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    if (observable == (((gui.ObservableChangeEvent) (o)).getObservableObserver())) {
        o_activeLabel.setEnabled(((o_component.isActive()) && ((o_component.getParentComponent()) != null)));
        o_textField.setForeground((o_component.isActive() ? java.awt.Color.black : java.awt.Color.gray));
    }
}