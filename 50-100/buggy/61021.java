@java.lang.Override
public org.apache.ignite.math.impls.Element minValue() {
    int minIdx = 0;
    int len = sto.size();
    for (int i = 1; i < len; i++)
        if ((sto.get(i)) < (sto.get(minIdx)))
            minIdx = i;
        
    
    return mkElement(minIdx);
}