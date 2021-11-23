@org.junit.Test
public void fix() {
    sonata.kernel.placement.pd.SonataPackage brokenPkg = sonata.kernel.placement.PackageLoader.loadSonataPackageFromDisk(java.nio.file.Paths.get("YAML", "packages", "mild-broken", "mild-broken.son").toString());
    brokenPkg.validation.validate();
    brokenPkg.validation.fixCustomAssumptions();
    java.lang.String validationLog = brokenPkg.validation.getValidationLog();
    sonata.kernel.placement.pd.Validation v = new sonata.kernel.placement.pd.Validation(brokenPkg);
    v.validate();
    java.lang.String validationLogFixed = v.getValidationLog();
    assert (validationLogFixed.length()) < (validationLog.length());
}