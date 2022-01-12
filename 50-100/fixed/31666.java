public static boolean isBenchPosition(model.enums.PositionID posID) {
    switch (posID) {
        case BLUE_BENCH_1 :
            return true;
        case BLUE_BENCH_2 :
            return true;
        case BLUE_BENCH_3 :
            return true;
        case BLUE_BENCH_4 :
            return true;
        case BLUE_BENCH_5 :
            return true;
        case RED_BENCH_1 :
            return true;
        case RED_BENCH_2 :
            return true;
        case RED_BENCH_3 :
            return true;
        case RED_BENCH_4 :
            return true;
        case RED_BENCH_5 :
            return true;
        default :
            return false;
    }
}