@org.springframework.scheduling.annotation.Scheduled(fixedRate = 5000)
public void reportCurrentTime() {
    com.myapos.clientmanager.scheduledTasks.ScheduledTasks.log.info("The time is now {}", com.myapos.clientmanager.scheduledTasks.ScheduledTasks.dateFormat.format(new java.util.Date()));
    org.springframework.security.core.context.SecurityContextHolder.getContext().setAuthentication(new org.springframework.security.authentication.UsernamePasswordAuthenticationToken("myapos", "doesn't matter", org.springframework.security.core.authority.AuthorityUtils.createAuthorityList("ROLE_MANAGER")));
    java.lang.Iterable<com.myapos.clientmanager.scheduledTasks.Student> allStudents = this.students.findAll();
    java.lang.Iterable<com.myapos.clientmanager.scheduledTasks.Payed> allPayeds = this.payeds.findAll();
    int size = sizeOfIterablePayed(allPayeds);
}