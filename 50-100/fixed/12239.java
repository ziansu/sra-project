public int getStats(java.lang.String route, int stat) {
    int output = 0;
    switch (route) {
        case "conquest" :
            {
                output = conquest[stat];
                break;
            }
        case "birthright" :
            {
                output = birthright[stat];
                break;
            }
        case "revelations" :
            {
                output = revelations[stat];
                break;
            }
    }
    return output;
}