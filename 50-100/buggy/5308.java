public static java.util.ArrayList<org.smartregister.immunization.db.VaccineRepo.Vaccine> nextVaccines(java.lang.String vaccine) {
    java.util.ArrayList<org.smartregister.immunization.db.VaccineRepo.Vaccine> vl = new java.util.ArrayList<>();
    for (org.smartregister.immunization.db.VaccineRepo.Vaccine v : org.smartregister.immunization.db.VaccineRepo.Vaccine.values()) {
        if ((v.prerequisite) != null) {
            if (v.prerequisite().name().equalsIgnoreCase(vaccine.trim())) {
                vl.add(v);
            }
        }
    }
    return vl;
}