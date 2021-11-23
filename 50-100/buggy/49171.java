@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public boolean setLocalVar(java.lang.String name, java.lang.Object val) {
    if (local_variables.containsKey(name)) {
        local_variables.put(name, val);
    }else
        if (reference_variables.containsKey(name)) {
            reference_variables.get(name).set(val);
        }else {
            return false;
        }
    
    return true;
}