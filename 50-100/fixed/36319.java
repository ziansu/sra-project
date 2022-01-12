@java.lang.Override
protected com.google.common.collect.ImmutableList<java.lang.String> getShellCommandInternal(com.facebook.buck.step.ExecutionContext context) {
    com.google.common.collect.ImmutableList.Builder<java.lang.String> commandBuilder = com.google.common.collect.ImmutableList.builder();
    commandBuilder.addAll(command);
    commandBuilder.add("-o", context.getProjectFilesystem().resolve(output).toString(), context.getProjectFilesystem().resolve(input).toString());
    return commandBuilder.build();
}