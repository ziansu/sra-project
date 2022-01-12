public double processDeterminedOutcome(java.lang.String outcome) {
    switch (outcome) {
        case "win" :
            return (bet.getBetValue()) * 2;
        case "lose" :
            return 0;
        case "tie" :
            return (bet.getBetValue()) / 2;
        default :
            return 22;
    }
}