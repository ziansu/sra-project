private static java.util.ArrayList<java.lang.String> getKarteien() {
    if (((database.Stack.getStacknames()) == null) || (database.Stack.getStacknames().get(0).equals(""))) {
        debug.Debugger.out("Diagramm: getKarteien if");
        return statistics.Diagramm.Stacks = null;
    }else {
        debug.Debugger.out("Diagramm: getKarteien Else");
        return statistics.Diagramm.Stacks = database.Stack.getStacknames();
    }
}