public co.edu.uniandes.waveteam.sistemahospital.entities.DoctorEntity toEntity() {
    co.edu.uniandes.waveteam.sistemahospital.entities.DoctorEntity entity = new co.edu.uniandes.waveteam.sistemahospital.entities.DoctorEntity();
    entity.setId(this.getId());
    entity.setConsultorio(this.consultorio);
    entity.setName(this.name);
    co.edu.uniandes.waveteam.sistemahospital.entities.EspecialidadEntity ent = new co.edu.uniandes.waveteam.sistemahospital.entities.EspecialidadEntity();
    ent.setName(this.getEspecialidad());
    entity.setEspecialidad(ent);
    return entity;
}