public void testEditModeReplace() {
    enterEditModeWithOneMarkedSymbol();
    solo.clickOnButton(org.catrobat.musicdroid.pocketmusic.uitest.instrument.piano.PianoActivityUiTest.PIANO_BUTTON_TEXT);
    assertEquals(1, pianoActivity.getSymbolContainer().size());
    assertFalse(pianoActivity.getSymbolContainer().get(0).isMarked());
}