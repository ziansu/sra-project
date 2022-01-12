@java.lang.Override
public boolean isSnExist(java.lang.Integer id, java.lang.Integer sn) {
    com.hose.model.Donkey donkey = donkeyRepository.findOneBySn(sn);
    if (donkey == null)
        return false;
    
    if (id == 0)
        return true;
    
    return !(id.equals(donkey.getId()));
}