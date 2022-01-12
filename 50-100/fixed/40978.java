private int setRank(java.lang.String rank) {
    int temp = indivInfo.Doctor.string2Int(rank);
    if ((temp > (indivInfo.Doctor.RANK_LOWEST)) || (temp < (indivInfo.Doctor.RANK_HIGHEST)))
        throw new java.lang.IllegalArgumentException(((((("rank " + rank) + " should be between ") + (indivInfo.Doctor.RANK_LOWEST)) + " and ") + (indivInfo.Doctor.RANK_HIGHEST)));
    
    return temp;
}