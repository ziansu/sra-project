public static void addYearCredits(final java.util.Map<org.fenixedu.academic.domain.curricularPeriod.CurricularPeriod, java.math.BigDecimal> result, final org.fenixedu.academic.domain.curricularPeriod.CurricularPeriod curricularPeriod, final java.math.BigDecimal credits) {
    final java.math.BigDecimal creditsYear = result.get(curricularPeriod);
    result.put(curricularPeriod, (creditsYear != null ? creditsYear.add(credits) : credits));
}