@java.lang.Override
public com.example.domain.TableOfRestaurant getByNumber(int num, java.lang.Long id) {
    return repository.getByNum(num, id);
}