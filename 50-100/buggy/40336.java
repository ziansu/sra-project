public int getLongestTrainPos() {
    int maxSize = 0;
    java.util.LinkedList longestTrain = null;
    int longestTrainPos = 0;
    for (int i = 0; i < (this.getTracks().length); i++) {
        java.util.LinkedList<Common.Wagon> train = this.getTracks()[i];
        if ((train.size()) > maxSize) {
            maxSize = train.size();
            longestTrainPos = i;
        }
    }
    return longestTrainPos;
}