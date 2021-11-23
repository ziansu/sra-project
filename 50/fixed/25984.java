@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    handleChange(getValue(), this);
    label.setText(decimalFormat.format(getValue().getValue()));
}