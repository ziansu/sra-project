public void preprocess() {
    InputReader ir = new InputReader();
    if ((hotels) != null)
        ir.readReviews("./inputFiles/reviews/", hotels);
    
    java.lang.System.out.println("========");
    s = ir.readSemantics("./inputFiles/semantics/semantics.json");
    topicMap = ir.createTopicMap("./inputFiles/semantics/topics.json");
    java.lang.System.out.println("========");
    calculateSentenceValues();
}