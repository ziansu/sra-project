private java.io.InputStream bundleB() {
    return org.ops4j.pax.tinybundles.core.TinyBundles.bundle().set(Constants.BUNDLE_SYMBOLICNAME, org.apache.aries.subsystem.itests.defect.Aries1383Test.BUNDLE_B).set(Constants.EXPORT_PACKAGE, org.apache.aries.subsystem.itests.defect.Aries1383Test.PACKAGE_B).build();
}