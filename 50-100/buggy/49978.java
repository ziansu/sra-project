public void apply(int[] data) {
    int firstElement = (data.length) - (window);
    if (firstElement < 0)
        firstElement = 0;
    
    double vals = window;
    if ((data.length) < (window))
        vals = data.length;
    
    double sum = 0.0;
    for (int i = data.length; i > firstElement; i++) {
        sum += data[i];
    }
    mean = sum / vals;
}