java.lang.String fizzBuzzSequence() {
    java.lang.String result = "";
    for (int i = 1; i <= 50; i++) {
        result += (fizzBuzz(i)) + ", ";
    }
    return result;
}