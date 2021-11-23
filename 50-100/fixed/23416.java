public static Question parse(java.lang.String buffer) {
    java.lang.String[] splitString = buffer.split("~");
    java.util.ArrayList<java.lang.String> answer = new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(splitString[3].split("$")));
    Question question = new Question(splitString[1], answer);
    return question;
}