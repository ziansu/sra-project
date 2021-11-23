@java.lang.Override
public boolean fight(java.lang.String oponent) {
    if (oponent.equals("1")) {
        run(assignment4.Critter.getRandomInt(8));
        return false;
    }else
        return true;
    
}