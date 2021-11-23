@java.lang.Override
public final void initialize() throws ptolemy.kernel.util.IllegalActionException {
    super.initialize();
    if ((implementation) == null) {
        if (java.util.Objects.equals("true", java.lang.System.getProperty("java.awt.headless"))) {
            implementation = new pl.psnc.indigo.fg.kepler.helper.ShowSVGBatch();
        }else {
            implementation = new pl.psnc.indigo.fg.kepler.helper.ShowSVGWithGui();
        }
    }
}