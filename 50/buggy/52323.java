@java.lang.Override
public fr.univbrest.dosi.bean.Formation updateFormation(java.lang.String codeFormation, fr.univbrest.dosi.bean.Formation formation) {
    return formationRepo.save(formation);
}