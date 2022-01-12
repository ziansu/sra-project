public boolean changeQuizName(java.lang.String newQuizName) {
    Category c = new Category(category);
    c.readFromFile(((c.getCategory()) + ".txt"));
    if (c.change(quizName, newQuizName)) {
        this.quizName = newQuizName;
        return true;
    }
    return false;
}