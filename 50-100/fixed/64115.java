private java.util.ArrayList<edu.cwru.eecs.t6.picbucket.TimelineFragment.EventInfo> nonEmptyEvents(java.util.ArrayList<edu.cwru.eecs.t6.picbucket.TimelineFragment.EventInfo> originalList) {
    java.util.ArrayList<edu.cwru.eecs.t6.picbucket.TimelineFragment.EventInfo> output = new java.util.ArrayList<>();
    for (edu.cwru.eecs.t6.picbucket.TimelineFragment.EventInfo unfiltered : originalList) {
        unfiltered.estimatedCount = edu.cwru.eecs.t6.picbucket.Core.listOfPhotos(unfiltered.startTime, unfiltered.endTime, unfiltered.location);
        if ((unfiltered.estimatedCount) > 0) {
            output.add(unfiltered);
        }
    }
    return output;
}