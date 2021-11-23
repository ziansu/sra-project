@org.junit.Test
public void bestGuessForString_nestedClass() {
    com.google.common.truth.Truth.assertThat(dagger.internal.codegen.writer.ClassName.bestGuessFromString(java.util.Map.Entry.class.getCanonicalName())).isEqualTo(dagger.internal.codegen.writer.ClassName.create("java.util", com.google.common.collect.ImmutableList.of("Map"), "Entry"));
    com.google.common.truth.Truth.assertThat(dagger.internal.codegen.writer.ClassName.bestGuessFromString(dagger.internal.codegen.writer.ClassNameTest.OuterClass.InnerClass.class.getCanonicalName())).isEqualTo(dagger.internal.codegen.writer.ClassName.create("dagger.internal.codegen.writer", com.google.common.collect.ImmutableList.of("ClassNameTest", "OuterClass"), "InnerClass"));
}