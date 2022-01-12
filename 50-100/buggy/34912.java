private static Question makeQuestion(java.lang.String questionText, java.lang.String[] optionsText) {
    java.util.ArrayList<Option> tempOptions = new java.util.ArrayList<Option>();
    int length = optionsText.length;
    for (int i = 0; i < length; i++) {
        tempOptions.add(new Option(optionsText[i]));
    }
    return new Question(questionText, tempOptions);
}