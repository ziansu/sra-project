@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    o_textField.getDocument().removeDocumentListener(x_listener);
    o_textField.setText(o_component.getText());
    o_textField.setForeground((o_component.isActive() ? java.awt.Color.black : java.awt.Color.gray));
    o_activeLabel.setEnabled((((o_component.getParentComponent()) != null) && (o_component.isActive())));
    o_textField.getDocument().addDocumentListener(x_listener);
}