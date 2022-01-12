public static void create(hospital.models.Patient entity) {
    hospital.repositories.concrete.Repository<hospital.models.Address> addressRepository = new hospital.repositories.concrete.Repository<hospital.models.Address>(hospital.models.Address.class);
    addressRepository.add(entity.getAddress());
    addressRepository.close();
    hospital.repositories.concrete.Repository<hospital.models.Patient> patientRepository = new hospital.repositories.concrete.Repository<hospital.models.Patient>(hospital.models.Patient.class);
    patientRepository.add(entity);
    patientRepository.close();
}