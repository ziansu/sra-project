private org.ibit.rol.sac.model.ProcedimientoLocal guardarProcedimientoAntiguo(org.ibit.rol.sac.model.ProcedimientoLocal procediment, org.ibit.rol.sac.model.ProcedimientoLocal procedimentOld) {
    procediment.setId(procedimentOld.getId());
    procediment.setTramites(procedimentOld.getTramites());
    procediment.setOrganResolutori(procedimentOld.getOrganResolutori());
    procediment.setPublicosObjetivo(procedimentOld.getPublicosObjetivo());
    procediment.setMaterias(procedimentOld.getMaterias());
    procediment.setNormativas(procedimentOld.getNormativas());
    return procediment;
}