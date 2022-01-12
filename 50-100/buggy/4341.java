@java.lang.Override
public void run() {
    java.util.List<java.lang.String> voltages = com.grarak.kerneladiutor.utils.kernel.CPUVoltage.getVoltages();
    for (int i = 0; i < (mVoltageCard.length); i++) {
        mVoltageCard[i].setDescription(((voltages.get(i)) + (getString(R.string.mv))));
        mVoltageCard[i].setValue(voltages.get(i));
    }
}