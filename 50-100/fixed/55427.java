protected void dieOnCircularReference(java.util.Stack<java.lang.Object> stk, org.apache.tools.ant.Project p) throws org.apache.tools.ant.BuildException {
    if (isChecked()) {
        return ;
    }
    if (isReference()) {
        super.dieOnCircularReference(stk, p);
    }else {
        if ((nested) != null) {
            pushAndInvokeCircularReferenceCheck(((org.apache.tools.ant.types.DataType) (nested)), stk, p);
        }
        setChecked(true);
    }
}