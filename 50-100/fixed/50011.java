@java.lang.Override
public V put(K key, V value) {
    V previousValue;
    if (((parentWorkflowVariables) != null) && (parentWorkflowVariables.isValidKey(key))) {
        previousValue = parentWorkflowVariables.put(key, value);
    }else
        if (isValidKey(key)) {
            previousValue = localWorkflowVariables.put(key, value);
        }else {
            throw new java.lang.IllegalArgumentException((("Key : " + key) + " is not defined as a variable name."));
        }
    
    return previousValue;
}