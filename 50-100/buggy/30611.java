public void study(int hrs) {
    Student.setKnow(((Student.getKnow()) + (hrs * 5)));
    Student.setStress(((Student.getStress()) + (hrs * 3)));
    Student.setEnergy(((Student.getEnergy()) - (hrs * 5)));
}