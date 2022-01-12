public static org.opengis.referencing.operation.MathTransform1D create(final double base, final double offset) {
    org.apache.sis.util.ArgumentChecks.ensureStrictlyPositive("base", base);
    if (base == 10) {
        return org.apache.sis.referencing.operation.transform.LogarithmicTransform1D.Base10.create(offset);
    }else {
        return org.apache.sis.referencing.operation.transform.LogarithmicTransform1D.NATURAL.concatenate((1 / (java.lang.Math.log(base))), offset);
    }
}