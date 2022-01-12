@java.lang.Override
public org.gradle.api.file.FileCollection call() {
    return sourceSet.getOutput().getClassesDirs();
}