@java.lang.Override
public ua.com.jobsukraine.entity.Candidate findByLogin(java.lang.String login) {
    ua.com.jobsukraine.entity.Candidate c = null;
    try {
        c = candidateRepository.findByInfo(loginInfoRepository.findByLogin(login));
        if ((candidateRepository.getFeedbacks(c.getId())) != null)
            c.setRating(candidateRepository.getGlobalRating(c.getId()));
        
    } catch (org.springframework.dao.EmptyResultDataAccessException e) {
    }
    return c;
}