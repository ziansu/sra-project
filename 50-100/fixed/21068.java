protected void calcVoltageA() {
    voltageA = round2decimals((((energyA) / (capacityA)) * 1000));
    editText3.setText(java.lang.Double.toString(voltageA));
    editText3.setText(java.lang.Double.toString(voltageA));
    if (((capacityB) != 0) && ((voltageB) != 0.0)) {
        calcResult();
    }
}