@org.junit.Test
public void classNameFromTypeElement() {
    javax.lang.model.util.Elements elements = compilationRule.getElements();
    javax.lang.model.element.TypeElement element = elements.getTypeElement(java.lang.Object.class.getCanonicalName());
    com.google.common.truth.Truth.assert_().that(dagger.internal.codegen.writer.ClassName.fromTypeElement(element).canonicalName()).isEqualTo("java.lang.Object");
}