public void applyWeight() {
    double threshold = (numberOfPeers) * 0.66;
    mQueueElementList.get(((mQueueElementList.size()) - 1)).weight = threshold;
    double test = mQueueElementList.get(((mQueueElementList.size()) - 1)).weight;
}