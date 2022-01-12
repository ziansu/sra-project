@java.lang.Override
public com.valkryst.VTerminal.component.RadioButton build() {
    checkState();
    final com.valkryst.VTerminal.component.RadioButton radioButton = new com.valkryst.VTerminal.component.RadioButton(this);
    group.addRadioButton(radioButton);
    super.width = (text.length()) + 2;
    super.height = 1;
    return radioButton;
}