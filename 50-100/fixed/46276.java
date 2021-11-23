@java.lang.Override
void run() {
    ru.amaicode.hh.school.runners.SearchSubsequencesRunner.LOGGER.info("In SearchSubsequencesRunner.run");
    java.lang.String line;
    while ((line = scanner.nextLine()) != null) {
        ru.amaicode.hh.school.runners.SearchSubsequencesRunner.LOGGER.debug("Processing line: {}", line);
        java.math.BigInteger firstOccurrence = findFirstOccurrence(line);
        writer.writeBigInt(firstOccurrence);
        ru.amaicode.hh.school.runners.SearchSubsequencesRunner.LOGGER.debug("First Occurrence: ", firstOccurrence);
    } 
}