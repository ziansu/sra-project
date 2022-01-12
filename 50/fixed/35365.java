@org.springframework.transaction.annotation.Transactional
public java.util.List<com.codegroup.challengecloud.model.Challenge> findAll() {
    return challengeDao.findAll();
}