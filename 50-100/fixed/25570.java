@java.lang.Override
public void delete(org.springframework.samples.petclinic.model.Specialty specialty) {
    java.lang.String specId = specialty.getId().toString();
    this.em.createNativeQuery(("DELETE FROM vet_specialties WHERE specialty_id=" + specId)).executeUpdate();
    this.em.createQuery(("DELETE FROM Specialty specialty WHERE id=" + specId)).executeUpdate();
}