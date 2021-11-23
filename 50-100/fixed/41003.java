public static void main(java.lang.String[] args) {
    com.tsystems.csvReader file = new com.tsystems.csvReader();
    java.util.ArrayList questionTable = new java.util.ArrayList(file.readFile());
    int score = 0;
    com.tsystems.Quiz quiz = new com.tsystems.Quiz(score, questionTable);
    quiz.executeQA(questionTable);
}