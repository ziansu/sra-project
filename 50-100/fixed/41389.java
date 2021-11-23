private static double calculateTax(double income) {
    double tax = 0.0;
    for (double[] T : com.timvisee.hhsbigjava.c3.BigJavaP3_21.TAX_CONFIG) {
        tax += ((T[0]) != (-1.0) ? java.lang.Math.min(income, T[0]) : income) * (T[1]);
        if ((income -= T[0]) <= 0)
            break;
        
    }
    return tax;
}