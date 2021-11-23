public double processTieOutcome(java.lang.String outcome) {
    switch (outcome) {
        case "win" :
            return (bet.getBetValue()) * 2;
        case "lose" :
            return -(bet.getBetValue());
        case "tie" :
            return (bet.getBetValue()) * 3;
        default :
            return 22;
    }
}