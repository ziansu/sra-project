@Test
public void Cd_instantiatesCorrectly_true() {
    Cd myCd = new Cd("Okay Computer", "Radiohead");
    assertEquals(true, (myCd instanceof Cd));
}