public static ratpack.thymeleaf3.Template thymeleafTemplate(java.lang.String name, java.lang.String contentType, java.util.function.Consumer<? super com.google.common.collect.ImmutableMap.Builder<java.lang.String, java.lang.Object>> modelBuilder) {
    com.google.common.collect.ImmutableMap.Builder<java.lang.String, java.lang.Object> builder = com.google.common.collect.ImmutableMap.builder();
    modelBuilder.accept(builder);
    return ratpack.thymeleaf3.Template.thymeleafTemplate(builder.build(), name, contentType);
}