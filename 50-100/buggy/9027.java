public static void addYearCredits(final java.util.Map<org.fenixedu.academic.domain.curricularPeriod.CurricularPeriod, java.math.BigDecimal> result, final org.fenixedu.academic.domain.curricularPeriod.CurricularPeriod curricularPeriod, final java.math.BigDecimal credits) {
    java.math.BigDecimal creditsYear = result.get(curricularPeriod);
    if (creditsYear != null) {
        creditsYear = creditsYear.add(credits);
    }else {
        result.put(curricularPeriod, credits);
    }
}