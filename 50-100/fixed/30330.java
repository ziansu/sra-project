@java.lang.Override
public com.facebook.buck.cxx.NativeLinkableInput getNativeLinkableInput(com.facebook.buck.cxx.CxxPlatform cxxPlatform, com.facebook.buck.cxx.Linker.LinkableDepType type) {
    com.facebook.buck.halide.HalideLibrary rule = ((com.facebook.buck.halide.HalideLibrary) (requireBuildRule(cxxPlatform)));
    java.nio.file.Path libPath = rule.getPathToOutput().resolve(rule.getLibraryName());
    return com.facebook.buck.cxx.NativeLinkableInput.of(com.facebook.buck.rules.args.SourcePathArg.from(getResolver(), new com.facebook.buck.rules.BuildTargetSourcePath(rule.getBuildTarget(), libPath)), com.google.common.collect.ImmutableSet.<com.facebook.buck.rules.coercer.FrameworkPath>of(), com.google.common.collect.ImmutableSet.<com.facebook.buck.rules.coercer.FrameworkPath>of());
}