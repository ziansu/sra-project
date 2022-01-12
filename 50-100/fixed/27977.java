@android.support.annotation.NonNull
private java.util.List<java.lang.Object> buildSolutionSection(@android.support.annotation.NonNull
java.lang.String title, @android.support.annotation.NonNull
com.jane.antonio.pishuvalko.models.SolutionStorage solutionStorage, @android.support.annotation.NonNull
java.util.List<com.jane.antonio.pishuvalko.models.WritableCharacter> characters) {
    java.util.List<java.lang.Object> res = new java.util.LinkedList<>();
    for (com.jane.antonio.pishuvalko.models.WritableCharacter character : characters) {
        if (solutionStorage.solutionExists(character)) {
            res.add(character);
        }
    }
    if ((res.size()) > 0) {
        res.add(0, new com.jane.antonio.pishuvalko.models.HeaderItem(title));
    }
    return res;
}