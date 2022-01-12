@java.lang.Override
public void run(int param) throws com.awprog.scroidv2.AlphaScript.ErrorDialog.ScriptException {
    double result = java.lang.Math.log10(((com.awprog.scroidv2.AlphaScript.NumberData) (getParams().inRight)).getValue());
    if (result == (java.lang.Double.NaN))
        throw new com.awprog.scroidv2.AlphaScript.ErrorDialog.ScriptException("Base 10 logarithm math error");
    else
        getParams().setReturn(result);
    
}