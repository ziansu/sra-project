@java.lang.Override
public double getLateFees(int daysLate) {
    java.lang.System.out.println(daysLate);
    return 0.75 * daysLate;
}