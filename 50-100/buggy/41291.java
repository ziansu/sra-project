@org.junit.Test
public void testSectionManyStylesInconsistency() {
    java.util.List<java.lang.Error> errors = nl.uva.softwcons.qls.validation.WidgetTypeCheckerTest.getWidgetTypeErrors(("page page1 { section \"section\" { question q1 " + ("default string widget radio (\"Yes\", \"No\") \n " + "default string widget radio (\"Yes\", \"No\")} } ")));
    org.assertj.core.api.Assertions.assertThat(errors).hasSize(2);
    org.assertj.core.api.Assertions.assertThat(errors).hasOnlyElementsOfType(nl.uva.softwcons.qls.validation.widget.error.IncompatibleWidget.class);
}