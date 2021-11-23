@java.lang.Override
public com.instapost.domain.Magazine findoneMagazine(java.lang.Integer magzineId) {
    magazineRepository.findOne(magzineId);
    return magazineRepository.findOne(magzineId);
}