@java.lang.Override
public org.ballerinalang.repository.PackageRepository loadRepository() {
    return new org.ballerinalang.repository.fs.JARPackageRepository(this, org.ballerinalang.builtin.StandardSystemPackageRepositoryProvider.JAR_SYSTEM_LIB_LOCATION);
}