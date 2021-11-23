@java.lang.Override
@com.udoo.restservice.spring.RequestMapping(value = "/{id}", method = RequestMethod.GET)
public java.lang.String getUserName(@com.udoo.restservice.spring.PathVariable(value = "id")
final java.lang.Integer id) {
    java.lang.System.out.println((id + "id"));
    if (id != null) {
        com.udoo.dal.entities.User user = userRepository.findByUid(id);
        if (user != null) {
            return user.toString();
        }else {
            return "Not Found";
        }
    }else {
        return "Error";
    }
}