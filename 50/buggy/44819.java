@java.lang.Override
@org.springframework.cache.annotation.CacheEvict(value = "Hotel", allEntries = true)
public com.twinsoft.domain.Hotel save(com.twinsoft.domain.Hotel hotel) {
    final com.twinsoft.domain.Hotel savedHotel = repository.save(hotel);
    return savedHotel;
}