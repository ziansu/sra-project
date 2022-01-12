@java.lang.Override
@org.springframework.cache.annotation.CachePut(value = "Hotel", keyGenerator = "keyGenerator")
public com.twinsoft.domain.Hotel update(com.twinsoft.domain.Hotel hotel) {
    return repository.save(hotel);
}