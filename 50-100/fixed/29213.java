@org.robotframework.javalib.annotation.RobotKeyword(value = "Input text")
@org.robotframework.javalib.annotation.ArgumentNames(value = { "image" , "text" })
public void inputText(java.lang.String image, java.lang.String text) throws java.lang.Exception {
    java.lang.System.out.println("Input Text:");
    java.lang.System.out.println(text);
    this.click(image);
    int result = screen.type(text);
    if (result == 0) {
        throw new com.github.rainmanwy.robotframework.sikulilib.exceptions.ScreenOperationException("Input text failed");
    }
}