public int runTurn() {
    java.lang.Integer x = waitOrSpawn();
    if (x != null)
        return x;
    
    for (int i = 0; i < (speed); i++) {
        int res = super.runTurn();
        if (res == 1) {
            return 1;
        }
    }
    java.lang.System.out.println(this);
    return 0;
}