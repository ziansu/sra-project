public static void update(hospital.models.Patient entity) {
    hospital.repositories.concrete.Repository<hospital.models.Address> addressRepository = new hospital.repositories.concrete.Repository<hospital.models.Address>(hospital.models.Address.class);
    addressRepository.update(entity.getAddress());
    hospital.repositories.concrete.Repository<hospital.models.Patient> patientRepository = new hospital.repositories.concrete.Repository<hospital.models.Patient>(hospital.models.Patient.class);
    patientRepository.update(entity);
    patientRepository.close();
}