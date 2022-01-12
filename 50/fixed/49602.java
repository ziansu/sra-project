@java.lang.Override
public void deleteMagazine(long magzineId) {
    magazineRepository.delete(magzineId);
}