public void voteThreshold(int downVotedTrack) {
    if (downVotedTrack < (mQueueElementList.size())) {
        if (((((threshold) + (mQueueElementList.get(downVotedTrack).upvoteList.size())) - (mQueueElementList.get(downVotedTrack).downvoteList.size())) <= 0) || (((MainActivity.mWifiDirectActivity.ipsOnNetwork.size()) + 1) == 1)) {
            deleteTrack(downVotedTrack);
        }
    }
}