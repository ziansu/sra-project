@java.lang.Override
public int compare(java.lang.String o1, java.lang.String o2) {
    long num1 = java.lang.Long.parseLong(o1.split("\\s+|\\t+")[1]);
    long num2 = java.lang.Long.parseLong(o2.split("\\s+|\\t+")[1]);
    if (num1 == num2)
        return 0;
    else
        if (num1 > num2)
            return 1;
        else
            return -1;
        
    
}