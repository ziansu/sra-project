@BeforeMethod
public void setup() {
    DynamicTagTests.message = (core.Utilities.randomWord()) + (core.Utilities.randomWord());
    DynamicTagTests.word = core.Utilities.randomWord();
}