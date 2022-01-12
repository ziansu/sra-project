@java.lang.Override
public voting.model.Candidate addNewCandidate(voting.dto.CandidateData candidateData) {
    voting.model.Candidate candidate = new voting.model.Candidate(candidateData.getFirstName(), candidateData.getLastName(), candidateData.getPersonId());
    return candidateRepository.save(candidate);
}