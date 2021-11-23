@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> createOptions() {
    java.util.Map<java.lang.String, java.lang.String> options = super.createOptions();
    com.google.common.collect.ImmutableMap.Builder<java.lang.String, java.lang.String> builder = new com.google.common.collect.ImmutableMap.Builder<java.lang.String, java.lang.String>();
    builder.putAll(options).put(CodegenConstants.IMPL_FOLDER, io.swagger.codegen.options.JaxRSServerOptionsProvider.IMPL_FOLDER_VALUE);
    return builder.build();
}