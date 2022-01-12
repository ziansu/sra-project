protected void fetchData() {
    us.nineworlds.serenity.jobs.SeasonsRetrievalJob seasonsRetrievalJob = new us.nineworlds.serenity.jobs.SeasonsRetrievalJob(key);
    jobManager.addJobInBackground(seasonsRetrievalJob);
}