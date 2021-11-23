public void checkFalsePositives() {
    java.util.ArrayList<java.lang.String> conflicts = splitConflictsInsideMethods();
    if ((conflicts.size()) > 1) {
        for (java.lang.String s : conflicts) {
            this.auxCheckFalsePositives(s);
        }
    }else {
        this.auxCheckFalsePositives(conflicts.get(0));
    }
}