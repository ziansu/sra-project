public void updateForNextCycle(javafx.scene.control.TextArea codeRefactorOutputArea, javafx.scene.control.TextArea testRefactorOutputArea) {
    this.classTemplate = codeRefactorOutputArea.getText();
    this.testTemplate = testRefactorOutputArea.getText();
    java.lang.System.out.println((((("Updated classTemplate:\n" + (classTemplate)) + "\nUpdated testTemplate:\n") + (testTemplate)) + "\n"));
}