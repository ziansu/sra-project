public static java.lang.Float getModuleProgress() {
    int sumOfResultEcts = 0;
    for (models.ExamResult result : models.Module.results) {
        sumOfResultEcts += result.getEcts();
    }
    float result = (sumOfResultEcts / (models.Module.ects)) * 100;
    java.math.BigDecimal tmp = new java.math.BigDecimal(result).setScale(2, java.math.RoundingMode.HALF_EVEN);
    result = tmp.floatValue();
    return result;
}