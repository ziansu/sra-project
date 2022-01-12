@org.junit.Test
public void bundleLocalPackage() throws com.github.eirslett.maven.plugins.frontend.lib.TaskRunnerException, java.io.IOException {
    java.net.URL res = com.google.common.io.Resources.getResource("helium/webpack.config.js");
    java.lang.String resDir = new java.io.File(res.getFile()).getParent();
    java.lang.String localPkg = resDir + "/../../../src/test/resources/helium/vis1";
    org.apache.zeppelin.helium.HeliumPackage pkg = new org.apache.zeppelin.helium.HeliumPackage(HeliumType.VISUALIZATION, "vis1", "vis1", localPkg, "", null, "license", "fa fa-coffee");
    java.io.File bundle = hbf.buildPackage(pkg, true, true);
    assertTrue(bundle.isFile());
}