@org.junit.Test
public void sumTest() {
    toDoubleTest(null, ( ref) -> {
        double sum = 0;
        for (double val : ref)
            sum += val;
        
        return sum;
    }, java.util.Vector::sum);
}