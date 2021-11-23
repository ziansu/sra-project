public void postQuestion(java.lang.String postedBy, java.lang.String title, java.lang.String q) {
    com.gpdisingapura.timotius.ask.model.Question question = new com.gpdisingapura.timotius.ask.model.Question(title, q, postedBy);
    mongoOperation.save(question);
}