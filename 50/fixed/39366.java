@java.lang.Override
public com.instapost.domain.Magazine findoneMagazine(long magzineId) {
    magazineRepository.findOne(magzineId);
    return magazineRepository.findOne(magzineId);
}