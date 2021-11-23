@java.lang.Override
public void checkSessionTimeOut(java.lang.String time) throws com.projectning.service.exceptions.SessionExpiredException {
    java.time.Instant exp = java.time.Instant.parse(time);
    if ((exp.compareTo(java.time.Instant.now())) < 0)
        throw new com.projectning.service.exceptions.SessionExpiredException();
    
}