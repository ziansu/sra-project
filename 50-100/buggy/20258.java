@org.junit.Test
public void peerNamed_deeplyNestedClass() {
    javax.lang.model.util.Elements elements = compilationRule.getElements();
    javax.lang.model.element.TypeElement element = elements.getTypeElement(dagger.internal.codegen.writer.ClassNameTest.OuterClass.InnerClass.class.getCanonicalName());
    dagger.internal.codegen.writer.ClassName className = dagger.internal.codegen.writer.ClassName.fromTypeElement(element);
    dagger.internal.codegen.writer.ClassName peerName = className.peerNamed("Foo");
    com.google.common.truth.Truth.assert_().that(peerName.canonicalName()).isEqualTo("dagger.internal.codegen.writer.ClassNameTest.OuterClass.Foo");
}