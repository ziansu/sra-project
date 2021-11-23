@java.lang.Override
public boolean matches(int[] tuple) {
    int a = 0;
    int b = 0;
    for (int i = 0; i < (tuple.length); i++) {
        if ((tuple[i]) == majority)
            a++;
        else
            if ((tuple[i]) == minority)
                b++;
            else
                return false;
            
        
    }
    return (a == ((tuple.length) - 1)) && (b == 1);
}