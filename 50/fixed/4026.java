@java.lang.Override
public com.facebook.buck.cxx.NativeLinkableInput getNativeLinkTargetInput(com.facebook.buck.cxx.CxxPlatform cxxPlatform) {
    return linkTargetInput.apply(cxxPlatform);
}