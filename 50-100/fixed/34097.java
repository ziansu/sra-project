@org.junit.Test
public void should_provide_Literals_for_source_of_custom_field_option() {
    com.google.eclipse.protobuf.protobuf.FieldOption option = xtext.find("type", ")", com.google.eclipse.protobuf.protobuf.FieldOption.class);
    org.eclipse.xtext.scoping.IScope scope = scopeProvider.getScope(com.google.eclipse.protobuf.scoping.ProtobufScopeProvider_scope_LiteralLink_target_Test.valueOf(option), com.google.eclipse.protobuf.protobuf.ProtobufPackage.Literals.LITERAL_LINK__TARGET);
    org.junit.Assert.assertThat(com.google.eclipse.protobuf.junit.IEObjectDescriptions.descriptionsIn(scope), com.google.eclipse.protobuf.junit.matchers.ContainNames.contain("ONE", "TWO"));
}