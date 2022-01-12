public int getVariable(java.lang.String id) {
    int i = 0;
    while (i < (_variables.size())) {
        if (_variables.get(i).contains(id))
            return _variables.get(i).get(id);
        else
            i++;
        
    } 
    return _variables.get((i - 1)).get(id);
}