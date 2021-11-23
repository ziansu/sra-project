@java.lang.Override
public void opCode(gpvm.GPVM g) {
    int a = g.pop();
    int b = g.pop();
    long prod = a * b;
    if ((prod / a) != b) {
        java.lang.System.out.println("Overflow During Calculation Process Aborted");
        java.lang.System.exit(0);
    }else
        g.push(((int) (prod)));
    
}