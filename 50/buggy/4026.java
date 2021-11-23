@java.lang.Override
public com.facebook.buck.cxx.NativeLinkableInput getNativeLinkTargetInput(com.facebook.buck.cxx.CxxPlatform cxxPlatform) {
    cxxPlatform.getCompilerDebugPathSanitizer().assertInProjectFilesystem(this, getProjectFilesystem());
    return linkTargetInput.apply(cxxPlatform);
}