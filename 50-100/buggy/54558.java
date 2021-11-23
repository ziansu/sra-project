@java.lang.Override
public void run(int param) throws com.awprog.scroidv2.AlphaScript.ErrorDialog.ScriptException {
    java.lang.StringBuilder txtOut;
    if ((getParams().inRight.getType()) == (com.awprog.scroidv2.AlphaScript.Data.DT.string))
        txtOut = ((com.awprog.scroidv2.AlphaScript.StringData) (getParams().inRight)).getValue();
    else
        txtOut = new java.lang.StringBuilder(getParams().inRight.toString());
    
    com.awprog.scroidv2.AlphaScript.Instructions.lla.out(LowLevelAccess.CommandOut.WRITE, txtOut);
}