public int getStats(java.lang.String route, int stat) {
    int output = 0;
    switch (route) {
        case "conquest" :
            {
                output = conquest[stat];
            }
        case "birthright" :
            {
                output = birthright[stat];
            }
        case "revelations" :
            {
                output = revelations[stat];
            }
    }
    return output;
}