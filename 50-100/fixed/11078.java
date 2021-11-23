@java.lang.Override
public java.lang.String save(com.sia.main.domain.SatManMK satManMK) {
    if ((satManMK.getIdSatManMK()) != null) {
        java.lang.System.out.println(satManMK.getIdSatManMK());
        satManMKRepo.update(satManMK);
        return satManMK.getIdSatManMK().toString();
    }else {
        return satManMKRepo.insert(satManMK).toString();
    }
}