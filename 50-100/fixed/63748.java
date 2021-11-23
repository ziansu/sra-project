@java.lang.Override
public org.apache.ignite.math.impls.Element maxValue() {
    int maxIdx = 0;
    int len = sto.size();
    for (int i = 0; i < len; i++)
        if ((sto.get(i)) > (sto.get(maxIdx)))
            maxIdx = i;
        
    
    return mkElement(maxIdx);
}