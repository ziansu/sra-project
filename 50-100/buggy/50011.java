@java.lang.Override
public V put(K key, V value) {
    V previousValue;
    if (isValidKey(key)) {
        if (((parentWorkflowVariables) != null) && (parentWorkflowVariables.containsKey(key))) {
            previousValue = parentWorkflowVariables.put(key, value);
        }else {
            previousValue = localWorkflowVariables.put(key, value);
        }
        return previousValue;
    }else {
        throw new java.lang.IllegalArgumentException((("Key : " + key) + " is not defined as a variable name."));
    }
}