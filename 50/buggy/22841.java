@java.lang.Override
public void delete(com.gemtastic.attendencesystem.enteties.Address address) {
    com.gemtastic.attendencesystem.enteties.Address merged = em.merge(address);
    em.remove(address);
}