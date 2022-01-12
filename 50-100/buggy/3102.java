@org.junit.Test
public void getCategoryOfAnnotation() throws java.lang.Exception {
    com.michaelfotiadis.validator.annotated.parser.AnnotationParserTest.TestInteger testInteger = new com.michaelfotiadis.validator.annotated.parser.AnnotationParserTest.TestInteger();
    com.michaelfotiadis.validator.annotated.parser.AnnotationParser parser = new com.michaelfotiadis.validator.annotated.parser.AnnotationParser();
    java.lang.annotation.Annotation annotation = com.michaelfotiadis.validator.annotated.parser.AnnotationParser.getAnnotation(testInteger, com.michaelfotiadis.validator.annotated.annotations.numeric.integernum.IntegerMinValue.class);
    org.junit.Assert.assertNotNull(annotation);
    com.michaelfotiadis.validator.annotated.annotations.AnnotationCategory category = com.michaelfotiadis.validator.annotated.parser.AnnotationParser.getCategoryOfAnnotation(annotation);
    org.junit.Assert.assertEquals(AnnotationCategory.INTEGER, category);
}