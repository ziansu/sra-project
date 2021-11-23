@java.lang.Override
@org.springframework.cache.annotation.CachePut(value = "Hotel", keyGenerator = "keyGenerator")
public com.twinsoft.domain.Hotel update(com.twinsoft.domain.Hotel hotel) {
    final com.twinsoft.domain.Hotel updatedHotel = repository.save(hotel);
    return updatedHotel;
}