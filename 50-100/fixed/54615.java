@org.junit.AfterClass
public static void tearDownClass() {
    if ((org.openflexo.foundation.OpenflexoProjectAtRunTimeTestCase._project) != null) {
        org.openflexo.foundation.OpenflexoProjectAtRunTimeTestCase._project.close();
    }
    if ((org.openflexo.foundation.OpenflexoProjectAtRunTimeTestCase._projectDirectory) != null) {
        org.openflexo.toolbox.FileUtils.deleteDir(org.openflexo.foundation.OpenflexoProjectAtRunTimeTestCase._projectDirectory);
    }
    org.openflexo.foundation.OpenflexoProjectAtRunTimeTestCase._editor = null;
    org.openflexo.foundation.OpenflexoProjectAtRunTimeTestCase._projectDirectory = null;
    org.openflexo.foundation.OpenflexoProjectAtRunTimeTestCase._project = null;
    if ((serviceManager) != null) {
        serviceManager.stopAllServices();
    }
}