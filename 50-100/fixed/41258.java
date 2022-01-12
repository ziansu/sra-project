public void conditionne(int v, java.lang.Integer value) {
    assert value != null;
    if ((values[v]) != value) {
        if ((values[v]) == null)
            (nbVarInstanciees)++;
        
        values[v] = value;
    }
    assert checkNbVarInstanciees();
}