@java.lang.Override
public void run(int param) throws com.awprog.scroidv2.AlphaScript.ErrorDialog.ScriptException {
    double result = java.lang.Math.pow(((com.awprog.scroidv2.AlphaScript.NumberData) (getParams().inLeft)).getValue(), ((com.awprog.scroidv2.AlphaScript.NumberData) (getParams().inRight)).getValue());
    if (((result == (java.lang.Double.NaN)) || (result == (java.lang.Double.NEGATIVE_INFINITY))) || (result == (java.lang.Double.POSITIVE_INFINITY)))
        throw new com.awprog.scroidv2.AlphaScript.ErrorDialog.ScriptException("Pow math error");
    else
        getParams().setReturn(result);
    
}