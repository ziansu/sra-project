public java.lang.String promptForWord(java.lang.String phrase) throws java.io.IOException {
    java.lang.String response = "";
    java.lang.System.out.printf("Please provide a %s: ", phrase);
    response = mReader.readLine();
    while (mCensoredWords.contains(response)) {
        java.lang.System.out.printf("Please be nice! Try again.%n");
        java.lang.System.out.printf("Please provide a %s: ", phrase);
        response = mReader.readLine();
    } 
    return response;
}