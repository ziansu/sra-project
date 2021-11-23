private java.lang.String writeToFile(p.lodz.pl.spjava.sdudkiewicz.models.Script script, java.lang.String text, java.lang.String subject) {
    java.lang.String fileName = subjectFile(script, subject);
    try {
        org.apache.commons.io.FileUtils.writeStringToFile(new java.io.File(fileName), text);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return text;
}