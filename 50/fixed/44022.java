@javax.persistence.Id
@javax.persistence.GeneratedValue(generator = "increment")
@org.hibernate.annotations.GenericGenerator(name = "increment", strategy = "increment")
@javax.persistence.Column(nullable = false)
public java.lang.Long getNumber() {
    return number.get();
}