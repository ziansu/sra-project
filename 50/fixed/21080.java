@java.lang.Override
public java.lang.String deleteUser(java.lang.Long id) {
    com.qa.cinema.persistence.User userInDB = findUser(id);
    if (userInDB != null) {
        em.remove(userInDB);
        return "{\"message\": \"User sucessfully deleted\"}";
    }else {
        return "{\"message\": \"User delete Failed\"}";
    }
}