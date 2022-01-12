public int getLongestTrainPos() {
    int maxSize = 0;
    int longestTrainPos = 0;
    for (int i = 0; i < (this.getTracks().length); i++) {
        java.util.LinkedList<Common.Wagon> train = this.getTracks()[i];
        if ((train != null) && ((train.size()) > maxSize)) {
            maxSize = train.size();
            longestTrainPos = i;
        }
    }
    return longestTrainPos;
}