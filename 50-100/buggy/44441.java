public static void mockCriteria() {
    controllers.VoteCriterion.create("Best Application", "Best app for use at ExceedCamp.");
    controllers.VoteCriterion.create("Best Design/UI", "Best User Interface and Design");
    controllers.RateCriterion.create("Ease of use", "how easy is to understand how to vote and actually vote? How easy is navigation? Is there clear feedback on what you have done so far?");
    controllers.RateCriterion.create("Reliability", "can you smoothly login and complete voting? Does app prevent submission of invalid data?");
    controllers.RateCriterion.create("Completeness", "does it have the features required by customer?");
    controllers.RateCriterion.create("Security ", "does application prevent unauthorized access? Can you logout of application? Hint: Look at the project's routes file on Github. Try to directly access the URLs without logging in.");
    controllers.RateCriterion.create("Quality of UI", "does it have consistent look? Can use on different size screens? Is important info clearly displayed? Is navigation clearly provided (not using browser 'back' button)?");
}