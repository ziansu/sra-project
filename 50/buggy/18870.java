@java.lang.Override
@com.udoo.restservice.spring.RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
public com.udoo.dal.entities.User getUser(@com.udoo.restservice.spring.PathVariable(value = "id")
final java.lang.Integer id) {
    java.lang.System.out.println((id + "id"));
    if (id != null) {
        return userRepository.findByUid(id);
    }else {
        return null;
    }
}