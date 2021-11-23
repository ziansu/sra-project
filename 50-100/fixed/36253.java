@org.junit.Before
public void init() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
    org.adempiere.test.AdempiereTestHelper.get().init();
    pointcut = new org.adempiere.ad.modelvalidator.Pointcut(PointcutType.DocValidate, org.adempiere.ad.modelvalidator.AnnotatedModelInterceptorDisablerTest.class.getMethod("someTestMethod"), new int[]{ org.compiere.model.ModelValidator.TIMING_AFTER_CLOSE }, false);
    annotatedModelInterceptorDisabler = new org.adempiere.ad.modelvalidator.AnnotatedModelInterceptorDisabler();
}