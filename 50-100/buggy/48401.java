public K next() {
    java.lang.System.out.println(("i before index: " + (i)));
    int index = (i)++;
    java.lang.System.out.println(("i before while: " + (i)));
    while (((i) < ((keys.length) - 1)) && ((keys[i]) == null))
        (i)++;
    
    java.lang.System.out.println(("i after while: " + (i)));
    return keys[index];
}