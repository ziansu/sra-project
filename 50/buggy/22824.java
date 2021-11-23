public void removeOccupation(com.wegas.resourceManagement.persistence.Occupation occupation) {
    if (this.getOccupations().remove(occupation)) {
        occupation.setResourceInstance(null);
    }
}