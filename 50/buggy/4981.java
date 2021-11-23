@org.junit.Test
public final void checkValueRetrievingFromBundle() {
    org.junit.Assert.assertEquals("Fortschritt", de.aikiit.fotorenamer.util.LocalizationHelper.getBundleString("fotorenamer.ui.progress"));
}