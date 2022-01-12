@java.lang.Override
public ar.edu.ungs.business.dto.RegistroHistoriaClinicaDTO toDTO(ar.edu.ungs.persistence.entities.historiaclinica.RegistroHistoriaClinica entity) {
    ar.edu.ungs.business.dto.RegistroHistoriaClinicaDTO dto = new ar.edu.ungs.business.dto.RegistroHistoriaClinicaDTO();
    dto.setFecha(entity.getFecha());
    dto.setDescripcion(entity.getDescripcion());
    if ((entity.getProfesional()) != null)
        dto.setProfesional(profesionalMapper.toDTO(entity.getProfesional()));
    else
        dto.setProfesional(null);
    
    return dto;
}