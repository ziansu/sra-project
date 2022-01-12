private void setBinaryFromDecimal() {
    int buffer = decimalValue;
    int power = 7;
    while ((buffer != 0) && (power >= 0)) {
        if (buffer > (java.lang.Math.pow(2, power))) {
            buffer = -((int) (java.lang.Math.pow(2, power)));
            binaryValue[power] = true;
        }else {
            binaryValue[power] = true;
        }
        --power;
    } 
}