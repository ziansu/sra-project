public void conditionne(int v, java.lang.Integer value) {
    if ((values[v]) != value) {
        if ((values[v]) == null)
            (nbVarInstanciees)++;
        
        values[v] = value;
    }
    assert checkNbVarInstanciees();
}