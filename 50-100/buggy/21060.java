@java.lang.Override
public void initialize() throws ptolemy.kernel.util.IllegalActionException {
    super.initialize();
    if ((implementation) == null) {
        implementation = (java.util.Objects.equals("true", java.lang.System.getProperty("java.awt.headless"))) ? new pl.psnc.indigo.fg.kepler.helper.ShowSVGBatch() : new pl.psnc.indigo.fg.kepler.helper.ShowSVGWithGui();
    }
}