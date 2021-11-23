@org.springframework.data.jpa.repository.Modifying
@org.springframework.data.jpa.repository.Query(value = "delete from SystemUserProperty sup  where sup.systemUser=:username and sup.propName=:prop_name and sup.propType=:prop_type")
int deleteProperty(@org.springframework.data.repository.query.Param(value = "username")
edu.cmu.cs.lti.discoursedb.core.model.system.SystemUser username, @org.springframework.data.repository.query.Param(value = "prop_type")
java.lang.String prop_type, @org.springframework.data.repository.query.Param(value = "prop_name")
java.lang.String prop_name);