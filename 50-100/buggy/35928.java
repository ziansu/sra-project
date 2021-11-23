public final boolean contains(final fr.uga.pddl4j.parser.Exp exp) {
    java.util.Iterator<fr.uga.pddl4j.parser.Exp> it = this.getChildren().iterator();
    while (it.hasNext()) {
        fr.uga.pddl4j.parser.Exp s = it.next();
        if ((s.equals(exp)) || (s.contains(exp))) {
            return true;
        }
    } 
    return false;
}