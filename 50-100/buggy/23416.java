public Question parse(java.lang.String buffer) throws java.lang.Exception {
    string[] splitString = buffer.split("~");
    java.util.ArrayList<java.lang.String> answer = new java.util.ArrayList<java.lang.String>(Array.asList(splintString[3].split("$")));
    Question question = new Question(splitString[1], answer);
    return question;
}