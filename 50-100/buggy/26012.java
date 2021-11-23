public void checkFalsePositives() {
    if (this.isMethodOrConstructor()) {
        java.util.ArrayList<java.lang.String> conflicts = splitConflictsInsideMethods();
        for (java.lang.String s : conflicts) {
            this.auxCheckFalsePositives(s);
        }
    }else {
        this.auxCheckFalsePositives(this.body);
    }
}