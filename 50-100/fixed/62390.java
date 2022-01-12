public boolean evaluateAnswerbyInput(java.lang.String input) {
    input = input.toLowerCase();
    if ((input.equals(value)) && (input == "yes")) {
        expert_system.Answer.answerCollection.add(value);
        return true;
    }
    expert_system.Answer.answerCollection.add(value);
    return false;
}