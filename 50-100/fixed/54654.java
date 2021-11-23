public void updateForNextCycle(javafx.scene.control.TextArea codeRefactorOutputArea, javafx.scene.control.TextArea testRefactorOutputArea) {
    this.classTemplate = codeRefactorOutputArea.getText().trim();
    this.testTemplate = testRefactorOutputArea.getText().trim();
    java.lang.System.out.println((((("Updated classTemplate:\n" + (classTemplate)) + "\nUpdated testTemplate:\n") + (testTemplate)) + "\n"));
}