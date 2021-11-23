public java.lang.String GetAGuessedCorrectlyComment() {
    int intRandomComment;
    java.util.Random objRandomComment = new java.util.Random();
    intRandomComment = objRandomComment.nextInt(7);
    return aryGuessedCorrectlyRandomComment.get(intRandomComment);
}