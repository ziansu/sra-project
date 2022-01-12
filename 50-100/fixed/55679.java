@javax.jws.WebMethod
public int personalSensitivityToInsulin(int physicalActivityLevel, int[] physicalActivitySamples, int[] bloodSugarDropSamples) {
    if ((checkArrayValues(physicalActivitySamples, bloodSugarDropSamples)) == (-1))
        return -1;
    
    if ((physicalActivityLevel < 0) || (physicalActivityLevel > 10))
        return -1;
    
    float[] result = linearRegression(physicalActivitySamples, bloodSugarDropSamples);
    return java.lang.Math.round(((result[1]) + ((result[0]) * physicalActivityLevel)));
}