@org.springframework.data.jpa.repository.Query(value = "SELECT Object(t) FROM TableOfRestaurant t WHERE t.number = ?1")
public com.example.domain.TableOfRestaurant getByNum(int num);