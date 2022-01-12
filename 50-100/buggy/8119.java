public static void main(java.lang.String[] args) {
    classifiers.NaiveBayesClassifier classifier = new classifiers.NaiveBayesClassifierImplementation();
    try {
        classifier.train(project.LoadFromSQL.loadFromSQL(new java.io.File("./data/funny_jokes.sql")));
        classifier.saveKnowledgeToFile(new java.io.File("./jokes.csv"));
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}