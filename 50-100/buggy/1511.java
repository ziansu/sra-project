@java.lang.Override
public void onDescribed(com.google.errorprone.matchers.Description description) {
    if ((description.fixes.size()) > 0) {
        com.google.errorprone.fixes.Fix fix = description.fixes.get(0);
        importsToAdd.addAll(fix.getImportsToAdd());
        importsToRemove.removeAll(fix.getImportsToRemove());
        for (com.google.errorprone.fixes.Replacement replacement : fix.getReplacements(endPositions)) {
            addReplacement(replacement);
        }
    }
}