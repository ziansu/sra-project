private boolean validateAge(java.lang.String inputAge, java.lang.String inputName, javafx.stage.Stage window3) {
    MemoryTest.errorPopUp error = new MemoryTest.errorPopUp();
    try {
        int age = java.lang.Integer.parseInt(inputAge);
        java.lang.System.out.println(((("Name is " + inputName) + ", Age is ") + age));
        selectLevelScreen(1, 2);
        window3.close();
        return true;
    } catch (java.lang.NumberFormatException e) {
        error.errorPop("Title", "Message");
        return false;
    }
}