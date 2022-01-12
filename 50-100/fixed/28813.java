public static boolean isLanguageEnabled(java.lang.String vmLanguage) {
    switch (vmLanguage) {
        case org.adoptopenjdk.jitwatch.core.JITWatchConstants.VM_LANGUAGE_CLOJURE :
            return false;
        case org.adoptopenjdk.jitwatch.core.JITWatchConstants.VM_LANGUAGE_GROOVY :
            return true;
        case org.adoptopenjdk.jitwatch.core.JITWatchConstants.VM_LANGUAGE_JAVA :
            return true;
        case org.adoptopenjdk.jitwatch.core.JITWatchConstants.VM_LANGUAGE_JAVASCRIPT :
            return false;
        case org.adoptopenjdk.jitwatch.core.JITWatchConstants.VM_LANGUAGE_JRUBY :
            return false;
        case org.adoptopenjdk.jitwatch.core.JITWatchConstants.VM_LANGUAGE_KOTLIN :
            return false;
        case org.adoptopenjdk.jitwatch.core.JITWatchConstants.VM_LANGUAGE_SCALA :
            return true;
        default :
            return false;
    }
}