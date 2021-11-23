public int findXCoordinate(java.lang.Object z) {
    for (int rlcv = 0; rlcv < (map.length); rlcv++) {
        for (int clcv = 0; clcv < (map.length); clcv++) {
            java.lang.Object check = map[rlcv][clcv];
            if (check instanceof present) {
                return rlcv;
            }
        }
    }
}