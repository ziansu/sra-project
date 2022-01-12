@java.lang.Override
public void reject(edu.wpi.disco.lang.Plan contributes, boolean implicit) {
    if ((isDefinedSlot("variable")) && (isDefinedSlot("value"))) {
        java.lang.String variable = getVariable();
        if ((getDisco().isDefinedGlobal(variable)) && (getDisco().getGlobal(variable).equals(getValue())))
            getDisco().deleteGlobal(variable);
        
    }
}