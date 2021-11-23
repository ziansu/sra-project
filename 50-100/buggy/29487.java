public void socialize(int hrs) {
    Student.setStress(((Student.getStress()) - (hrs * 5)));
    Student.setEnergy(((Student.getEnergy()) - (hrs * 4)));
}