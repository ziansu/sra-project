@java.lang.Override
public java.lang.Object benchmark() {
    int sum = 0;
    while (sum < 20000) {
        sum += sum + (singleRun());
    } 
    return sum;
}