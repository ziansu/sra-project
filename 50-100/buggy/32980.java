@org.junit.Test
public void should_provide_Literals_for_source_of_field_of_custom_option() {
    com.google.eclipse.protobuf.protobuf.Option option = xtext.find("info", ")", com.google.eclipse.protobuf.protobuf.Option.class);
    org.eclipse.xtext.scoping.IScope scope = scopeProvider.getScope(com.google.eclipse.protobuf.scoping.ProtobufScopeProvider_scope_LiteralLink_target_Test.valueOf(option), com.google.eclipse.protobuf.protobuf.ProtobufPackage.Literals.LITERAL_LINK__TARGET);
    xtext.find("Type", " {", java.lang.Enum.class);
    org.junit.Assert.assertThat(com.google.eclipse.protobuf.junit.IEObjectDescriptions.descriptionsIn(scope), com.google.eclipse.protobuf.junit.matchers.ContainNames.contain("ONE", "TWO"));
}