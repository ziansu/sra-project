public static org.apfloat.Apfloat merge(org.apfloat.Apfloat a_sum, org.apfloat.Apfloat b_sum, long precision) {
    precision++;
    org.apfloat.Apfloat total = new org.apfloat.Apfloat(13591409L).multiply(a_sum).add(new org.apfloat.Apfloat(545140134L).multiply(b_sum));
    org.apfloat.Apfloat sqrtTenThousandAndFive = org.apfloat.ApfloatMath.sqrt(new org.apfloat.Apfloat(10005L, precision));
    org.apfloat.Apfloat pi = new org.apfloat.Apfloat(426880L).multiply(sqrtTenThousandAndFive).divide(total).precision(precision);
    return pi;
}