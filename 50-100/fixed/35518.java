@java.lang.Override
public void run() {
    while (((numActiveWorkers.get()) != 0) || (!(results.isEmpty()))) {
        try {
            java.util.List<org.apache.mahout.cf.taste.similarity.precompute.SimilarItems> similarItemsOfABatch = results.poll(10, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (similarItemsOfABatch != null) {
                for (org.apache.mahout.cf.taste.similarity.precompute.SimilarItems similarItems : similarItemsOfABatch) {
                    writer.add(similarItems);
                    numSimilaritiesProcessed += similarItems.numSimilarItems();
                }
            }
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    } 
}