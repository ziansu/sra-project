@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    this.myFixture = super.myFixture;
    com.intellij.codeInsight.CodeInsightSettings _instance = com.intellij.codeInsight.CodeInsightSettings.getInstance();
    _instance.AUTOCOMPLETE_ON_CODE_COMPLETION = false;
}