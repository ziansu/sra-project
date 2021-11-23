public static void highlightElement(org.openqa.selenium.WebDriver driver, org.openqa.selenium.WebElement element) {
    org.openqa.selenium.JavascriptExecutor js = ((org.openqa.selenium.JavascriptExecutor) (driver));
    js.executeScript(("element = arguments[0];" + ((("original_style = element.getAttribute('style');" + "element.setAttribute(\'style\', original_style + \";") + "background: yellow; border: 2px solid red;\");") + "setTimeout(function(){element.setAttribute('style', original_style);}, 1000);")), element);
}