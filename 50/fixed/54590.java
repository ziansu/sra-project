public java.lang.Integer GetDigital(uk.ac.herts.SmartLab.XBee.Device.Pin pin) {
    if (this.digital.containsKey(pin))
        return ((java.lang.Integer) (digital.get(pin)));
    
    return null;
}