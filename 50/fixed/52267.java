@org.junit.Test
public void getPrecisionMacroTest() {
    assertEquals(1, de.unima.ki.mamba.evaluation.Characteristic.getPrecisionMacro(this.characteristics), 0.01);
}