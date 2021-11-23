@org.springframework.data.jpa.repository.Query(value = "from AreaDetail a where a.location=:location")
public java.util.List<po.AreaDetail> findByLocation(@org.springframework.data.repository.query.Param(value = "location")
java.lang.String location);