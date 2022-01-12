public boolean isCorrect(int choice) {
    return (choice >= 0) && (choices.get(choice).correctAnswer());
}