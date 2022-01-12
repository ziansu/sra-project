public int convertMaxBikeDistance() {
    int distance = 5000;
    switch (java.lang.Integer.parseInt(getMaxPreferredBikeDistance())) {
        case 0 :
            distance = 0;
            break;
        case 1 :
            distance = 2000;
            break;
        case 2 :
            distance = 5000;
            break;
        case 3 :
            distance = 10000;
            break;
        case 4 :
            distance = 20000;
            break;
    }
    return distance;
}