@java.lang.Override
public java.lang.Object getVariable(int index) {
    if (index < 0)
        return null;
    
    return ((clojure.lang.IPersistentVector) (variableTable.deref())).nth(index);
}