private static java.util.ArrayList<java.lang.String> getKarteien() {
    if (((database.Stack.getStacknames()) == null) || (database.Stack.getStacknames().get(0).equals(""))) {
        return statistics.Diagramm.Stacks = null;
    }else {
        return statistics.Diagramm.Stacks = database.Stack.getStacknames();
    }
}