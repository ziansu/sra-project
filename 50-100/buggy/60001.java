@org.testng.annotations.Test
public void can_get_term_in_english_with_missing_language() throws java.lang.Exception {
    interpreter = new org.gdl2.runtime.Interpreter("da");
    guidelineList.add(loadGuideline("Use_target_language_term_test.v1.gdl2"));
    java.util.List<org.gdl2.runtime.DataInstance> result = interpreter.executeGuidelines(guidelineList, dataInstances);
    org.gdl2.runtime.DataInstance dataInstance = result.get(0);
    org.gdl2.datatypes.DvCodedText dvCodedText = dataInstance.getDvCodedText(org.gdl2.runtime.UseTargetLanguageTest.PATH);
    org.hamcrest.MatcherAssert.assertThat(dvCodedText.getValue(), org.hamcrest.Matchers.is("Five"));
}