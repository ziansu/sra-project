private java.lang.String getDurationNum(int numOptions) {
    int durationNum = StdRandom.uniform(0, numOptions);
    switch (durationNum) {
        case 0 :
            subBeatCount += 4;
            return "i";
        case 1 :
            subBeatCount += 8;
            return "q";
        case 2 :
            subBeatCount += 2;
            return "s";
        case 3 :
            subBeatCount += 16;
            return "h";
        case 4 :
            subBeatCount += 1;
            return "t";
        case 5 :
            subBeatCount += 32;
            return "w";
        default :
            return null;
    }
}