public double avgValue() {
    for (int i = 0; i < (values.size()); i++)
        sum = (sum) + (values.get(i));
    
    return (sum) / 10;
}