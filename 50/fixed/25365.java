@java.lang.Override
public double sum() {
    double sum = 0;
    int len = sto.size();
    for (int i = 0; i < len; i++)
        sum += sto.get(i);
    
    return sum;
}