@java.lang.Override
public void act() {
    java.lang.Double prob = rand.nextDouble();
    switch (mode) {
        case AGGRESSIVEBUYER :
            if (prob > 0.75) {
                sellShare();
            }else {
                buyShare();
            }
        case BALANCED :
            if (prob > 0.5) {
                buyShare();
            }else {
                sellShare();
            }
        case AGGRESSIVESELLER :
            if (prob > 0.75) {
                buyShare();
            }else {
                sellShare();
            }
    }
}