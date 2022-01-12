public static void getKarteien() {
    if (((database.Stack.getStacknames()) == null) || (database.Stack.getStacknames().get(0).equals(""))) {
        debug.Debugger.out("Rangliste: getKarteien if");
        statistics.Rangliste.Stacks = null;
    }else {
        debug.Debugger.out("Rangliste: getKarteien Else");
        statistics.Rangliste.Stacks = database.Stack.getStacknames();
    }
}