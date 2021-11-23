@java.lang.Override
public int compareTo(com.jobmatch.algorithm.CandidateScore candidateScore) {
    return java.lang.Float.compare(this.closeness, candidateScore.closeness);
}