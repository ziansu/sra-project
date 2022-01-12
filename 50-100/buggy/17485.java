public int getVariable(java.lang.String id) {
    int i = 0;
    while (i < (_variables.size())) {
        if (_variables.get(i).contains(id))
            break;
        else
            i++;
        
    } 
    return _variables.get(i).get(id);
}