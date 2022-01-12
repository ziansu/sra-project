public boolean contain(ai.eboard e, int i) {
    if ((e.c) == 'X')
        return x.containsKey(i);
    else
        if ((e.c) == 'O')
            return o.containsKey(i);
        else
            return !(u.contains(i));
        
    
}