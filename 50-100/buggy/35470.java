@java.lang.Override
public java.util.List<ua.com.jobsukraine.entity.Candidate> getRandomBestCandidates(int amount, int minRating) {
    java.util.List<ua.com.jobsukraine.entity.Candidate> candidates = candidateRepository.findByRatingGreaterThan(minRating);
    java.util.Collections.shuffle(candidates);
    int amountOfCandidates = candidates.size();
    candidates = candidates.subList(0, (amountOfCandidates < amount ? amountOfCandidates : amount));
    java.util.Collections.sort(candidates);
    return candidates;
}