public boolean isFriendOrNot(int userID1, int userID2) {
    return ((((this.userID1) == userID1) && ((this.userID2) == userID2)) || (((this.userID1) == userID2) && ((this.userID2) == userID1))) || (userID1 == userID2);
}