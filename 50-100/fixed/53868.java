void invoke(org.concordion.integration.junit4.ConcordionFrameworkMethod concordionFrameworkMethod, java.lang.Object target) throws java.lang.Exception {
    org.concordion.api.Fixture fixture = createFixture(target);
    java.lang.String example = concordionFrameworkMethod.getExampleName();
    if ((failFastException) != null) {
        throw failFastException;
    }
    try {
        org.concordion.api.ResultSummary result = fixtureRunner.run(example, fixture);
        result.assertIsSatisfied(fixture);
    } catch (org.concordion.integration.junit4.ConcordionAssertionError e) {
    } catch (org.concordion.integration.junit4.FailFastException e) {
        failFastException = e;
        throw e;
    } catch (java.io.IOException e) {
        throw e;
    }
}