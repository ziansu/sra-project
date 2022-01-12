public void JobCompleted(Job.Job CompletedJob) {
    for (Game.Pawn Worker : CompletedJob.Workers) {
        IdleCitizen(Worker);
    }
    CompletedJob.Workers.clear();
    Job.JobMap.remove(CompletedJob.toString());
}