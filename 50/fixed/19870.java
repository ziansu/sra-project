@javax.persistence.Id
@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "taskIdGenerator")
@javax.persistence.SequenceGenerator(name = "taskIdGenerator", sequenceName = "TASK_ID_GENERATOR", allocationSize = 1)
@javax.persistence.Column(name = "ID", length = 38, nullable = false, unique = true, updatable = false)
public java.lang.Long getId() {
    if ((id) == null)
        return 0L;
    
    return id.get();
}