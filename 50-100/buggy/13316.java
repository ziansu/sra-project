@java.lang.Override
public void run(int param) throws com.awprog.scroidv2.AlphaScript.ErrorDialog.ScriptException {
    boolean left = ((com.awprog.scroidv2.AlphaScript.BooleanData) (getParams().inLeft)).getValue();
    boolean right = ((com.awprog.scroidv2.AlphaScript.BooleanData) (getParams().inRight)).getValue();
    getParams().setReturn(((left && (!right)) || ((!left) && right)));
}