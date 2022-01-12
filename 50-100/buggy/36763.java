public void assigner(java.lang.String id, int n) {
    int i = 0;
    while (i < (_variables.size())) {
        if (_variables.get(i).contains(id))
            break;
        else
            i++;
        
    } 
    _variables.get(i).put(id, n);
}