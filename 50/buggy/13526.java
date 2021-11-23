@org.junit.Test
public void shouldThrowExceptionWhenAddNonUniqueElement() throws java.lang.Exception {
    com.googlecode.catchexception.apis.BDDCatchException.when(set).add(10);
    org.assertj.core.api.BDDAssertions.then(com.googlecode.catchexception.apis.BDDCatchException.caughtException()).isInstanceOf(java.lang.IllegalArgumentException.class).hasMessage("Only unique elements!").hasNoCause();
}