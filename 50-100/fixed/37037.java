@java.lang.Override
public java.lang.String solve() {
    int step = 0;
    net.n1da.dev.euler.LargeNumber num = new net.n1da.dev.euler.LargeNumber(1);
    while (step < 1000) {
        num = num.add(num);
        step++;
    } 
    net.n1da.dev.euler.IO.debugln(("2^1000 = " + num));
    return num.sumOfDigits().toString();
}