public java.lang.String toString(com.company.Books pBook) {
    float[] rtnRatingsArr = this.getRatings(pBook);
    return ((((rtnRatingsArr[0]) + ", ") + (rtnRatingsArr[1])) + ", ") + (rtnRatingsArr[2]);
}