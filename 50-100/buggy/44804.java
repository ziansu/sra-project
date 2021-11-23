@java.lang.Override
public void run(java.lang.String... arg0) throws java.lang.Exception {
    repository.deleteAll();
    repository.save(new edu.cmu.ini.ericsson.practicum.models.userService.User("1", "John", "M", "Doctor", "15213", "6", "1qaz2wsx"));
    java.lang.System.out.println("findAll():");
    java.lang.System.out.println("-------------------------------");
    for (edu.cmu.ini.ericsson.practicum.models.userService.User movie : repository.findAll()) {
        java.lang.System.out.println(movie);
    }
    java.lang.System.out.println("--------------------------------");
    java.lang.System.out.println("findByName");
    java.lang.System.out.println("-------------------------------");
    java.lang.System.out.println(repository.findByName("2"));
    java.lang.System.out.println("--------------------------------");
}