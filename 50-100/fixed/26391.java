public static void getKarteien() {
    if (((database.Stack.getStacknames()) == null) || (database.Stack.getStacknames().get(0).equals(""))) {
        statistics.Rangliste.Stacks = null;
    }else {
        statistics.Rangliste.Stacks = database.Stack.getStacknames();
    }
}