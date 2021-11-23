public int startsright(char c) {
    Set<java.lang.Integer> s = new Set<java.lang.Integer>();
    s.addElement(start());
    freeSteps(s);
    for (int i = 0; i < (s.size()); i++)
        for (int j = 0; j < (getSize()); j++)
            if ((getEdge(s.getElement(i), j)) == c)
                return j;
            
        
    
    return -1;
}