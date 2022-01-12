@java.lang.Override
public java.lang.Object getLocalVar(java.lang.String name) throws com.js.interpreter.runtime.exception.RuntimePascalException {
    if (local_variables.containsKey(name)) {
        return local_variables.get(name);
    }else
        if (reference_variables.containsKey(name)) {
            return reference_variables.get(name).get();
        }else {
            return null;
        }
    
}