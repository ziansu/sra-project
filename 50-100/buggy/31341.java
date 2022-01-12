@java.lang.Override
public java.util.List<it.univaq.disim.mobile.todolist.business.domain.Dog> findDogs(java.lang.String token) {
    it.univaq.disim.mobile.todolist.business.domain.Session session = sessionRepository.findByToken(token);
    java.util.List<it.univaq.disim.mobile.todolist.business.domain.Dog> dogs = dogRepository.findByUserId(session.getUser().getId());
    dogs.forEach(java.lang.System.out::println);
    return dogs;
}