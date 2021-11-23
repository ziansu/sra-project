public void type(edu.wm.translationengine.classes.Component c) {
    java.lang.String espresso_command = new java.lang.String();
    java.lang.String id = c.getId().substring(((EspressoTranslator.packageName.length()) + 4));
    espresso_command += ((("\t\t\tonView(withId(R.id." + id) + ")).perform(typeText(\"") + (c.getText())) + "\"));\n";
    EspressoTranslator.toWrite.add(espresso_command);
    java.lang.System.out.println(espresso_command);
}