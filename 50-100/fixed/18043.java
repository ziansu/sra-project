@java.lang.Override
public int egreedyActionSelection(competition.richmario.StateAction sa, boolean update) {
    double rand = util.RNG.randomDouble();
    if (rand < (1.0 / 3.0)) {
        return 2;
    }else
        if (rand < (2.0 / 3.0)) {
            return 5;
        }else {
            return 11;
        }
    
}