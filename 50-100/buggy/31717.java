public int convertMaxWalkDistance() {
    int distance = 1000;
    switch (getMaxPreferredWalkDistance()) {
        case 0 :
            distance = 500;
            break;
        case 1 :
            distance = 1000;
            break;
        case 2 :
            distance = 2000;
            break;
        case 3 :
            distance = 3000;
            break;
        case 4 :
            distance = 5000;
            break;
        case 5 :
            distance = 10000;
            break;
    }
    return distance;
}