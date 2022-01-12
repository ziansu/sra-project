private void generateTraps(int limit) {
    int trapNumber = at.conradi.helloworld.MainActivity.newRandomNumberBetween(limit);
    java.lang.String logMessage = getResources().getString(R.string.log_trap_id);
    int amountOfTraps = 3;
    for (int i = 0; i < amountOfTraps; i++) {
        while (traps.contains(trapNumber)) {
            trapNumber = at.conradi.helloworld.MainActivity.newRandomNumberBetween(limit);
        } 
        android.util.Log.i(logMessage, java.lang.Integer.toString(trapNumber));
        traps.add(trapNumber);
    }
}