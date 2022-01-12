@com.modeliosoft.modelio.javadesigner.annotations.objid(value = "da43f4b5-7392-45fa-aaa1-0636243b388e")
public double getRangeInInches() {
    double voltageValue = input.getVoltage();
    return voltageValue / (5.0 / 512);
}