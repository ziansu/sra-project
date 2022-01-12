private static abalone.Cell.Direction oppositeDirection(abalone.Cell.Direction d) {
    switch (d) {
        case ONE :
            return abalone.Cell.Direction.FOUR;
        case TWO :
            return abalone.Cell.Direction.FIVE;
        case THREE :
            return abalone.Cell.Direction.SIX;
        case FOUR :
            return abalone.Cell.Direction.ONE;
        case FIVE :
            return abalone.Cell.Direction.TWO;
        case SIX :
            return abalone.Cell.Direction.THREE;
    }
    return d;
}