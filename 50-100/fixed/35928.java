public final boolean contains(final fr.uga.pddl4j.parser.Exp exp) {
    for (fr.uga.pddl4j.parser.Exp s : this.getChildren()) {
        if ((s.equals(exp)) || (s.contains(exp))) {
            return true;
        }
    }
    return false;
}