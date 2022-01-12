public java.util.List<fi.lifesup.hackathon.domain.Challenge> getChallenges() {
    fi.lifesup.hackathon.domain.User user = userRepository.getUserByAuthority(fi.lifesup.hackathon.security.SecurityUtils.getCurrentUserLogin(), "ROLE_ADMIN");
    if (user == null) {
        return challengeRepository.listChallenge();
    }else {
        user = userRepository.getUserByAuthority(fi.lifesup.hackathon.security.SecurityUtils.getCurrentUserLogin(), "ROLE_HOST");
        if (user == null) {
            return challengeRepository.findByCompanyId(user.getCompany().getId());
        }
    }
    return null;
}