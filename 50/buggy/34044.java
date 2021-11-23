@org.springframework.data.jpa.repository.Query(value = "select script.result from Script script where script.id = :id")
@org.springframework.data.rest.core.annotation.RestResource(path = "result")
java.util.Optional<java.lang.String> findResultById(@org.springframework.data.repository.query.Param(value = "id")
java.lang.Long id);