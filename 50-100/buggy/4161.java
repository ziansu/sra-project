private boolean desperationMode(classes.Player[] players, int numberOfEights) {
    if (numberOfEights > 0) {
        if (numberOfEights > 1) {
            return true;
        }else {
            for (int i = 0; i < (classes.Player[].class); i += 1) {
                if ((Player[i].hand.size = 2) && (numberOfEights == 1)) {
                    return true;
                }else {
                    return false;
                }
            }
        }
    }else {
        return false;
    }
}