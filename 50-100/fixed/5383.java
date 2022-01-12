public static data_security_assignment_2.Polynomial fromByte(int byteValue) {
    data_security_assignment_2.Polynomial res = new data_security_assignment_2.Polynomial(8);
    int index = 7;
    while ((index >= 0) && (byteValue > 0)) {
        if (byteValue >= (java.lang.Math.pow(2, index))) {
            byteValue -= java.lang.Math.pow(2, index);
            res.coeff[index] = true;
        }else {
            res.coeff[index] = false;
        }
        index--;
    } 
    return res;
}