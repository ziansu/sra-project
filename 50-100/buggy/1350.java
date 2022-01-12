private org.ricts.abstractmachine.components.compute.isa.OperandInfo getOperandInfo(android.widget.RadioGroup instrGroup, org.ricts.abstractmachine.components.compute.core.ComputeCore mainCore, int index) {
    android.widget.RadioButton button = ((android.widget.RadioButton) (instrGroup.findViewById(instrGroup.getCheckedRadioButtonId())));
    java.lang.String mneumonic = button.getText().toString();
    if (mneumonic.equals(org.ricts.abstractmachine.ui.activity.DATA_MNEUMONIC)) {
        return mainCore.getDataOperandInfo();
    }else {
        org.ricts.abstractmachine.components.compute.isa.OperandInfo[] operandInfoArray = mainCore.getOperandInfoArray(mneumonic);
        return operandInfoArray[index];
    }
}