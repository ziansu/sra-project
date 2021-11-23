public <T> org.gradle.external.javadoc.JavadocOptionFileOption<T> addOption(org.gradle.external.javadoc.JavadocOptionFileOption<T> option) {
    return optionFile.addOption(org.gradle.internal.Cast.<org.gradle.external.javadoc.internal.JavadocOptionFileOptionInternal<T>>uncheckedCast(option));
}