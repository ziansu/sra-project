@java.lang.Override
public int compareTo(com.jobmatch.algorithm.CandidateScore candidateScore) {
    return java.lang.Integer.compare(this.closeness, candidateScore.closeness);
}