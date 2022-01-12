private int logProgress(java.lang.Integer offset, java.lang.Integer totalNbOfItems, int lastPercentageOfProcessedItems) {
    int percentageOfProcessedItems = (offset * 100) / totalNbOfItems;
    if ((percentageOfProcessedItems > (lastPercentageOfProcessedItems + 10)) && (percentageOfProcessedItems < 100)) {
        logger.info("processed {} % so far", percentageOfProcessedItems);
        return (percentageOfProcessedItems / 10) * 10;
    }
    return lastPercentageOfProcessedItems;
}