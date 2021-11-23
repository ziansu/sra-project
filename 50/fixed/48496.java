@org.springframework.data.jpa.repository.Query(value = "select u from User u where first_name LIKE %:name% or last_name LIKE %:name%")
public java.util.List<ba.actis.models.User> findByName(@org.springframework.data.repository.query.Param(value = "name")
java.lang.String name);