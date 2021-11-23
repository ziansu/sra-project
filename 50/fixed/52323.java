@java.lang.Override
public fr.univbrest.dosi.bean.Formation updateFormation(fr.univbrest.dosi.bean.Formation formation) {
    return formationRepo.save(formation);
}