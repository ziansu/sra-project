static java.lang.CharSequence convertToCharacter(org.safs.tools.input.RobotKeyEvent event) {
    java.util.List<org.safs.tools.input.RobotKeyEvent> list = new java.util.ArrayList<org.safs.tools.input.RobotKeyEvent>();
    list.add(event);
    return org.safs.selenium.webdriver.lib.WDLibrary.keysparser.antiParse(list);
}