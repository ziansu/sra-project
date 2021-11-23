@java.lang.Override
public int compare(java.lang.String t1, java.lang.String t2) {
    if ((fitness(t1)) <= (fitness(t2)))
        return -1;
    else
        return 1;
    
}