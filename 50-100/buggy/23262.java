@javax.annotation.PostConstruct
public void findUsers() {
    userIds = new java.util.ArrayList<>();
    java.util.List<ba.aljovic.amer.application.database.entities.userratingsjob.ImdbUser> users = repository.findUsersByRange(fromId, toId);
    long start = java.lang.System.nanoTime();
    userIds.addAll(users.stream().map(ImdbUser::getId).collect(java.util.stream.Collectors.toList()));
    java.lang.System.out.println((("Time: " + (((java.lang.System.nanoTime()) - start) / 1000000)) + " ms."));
}