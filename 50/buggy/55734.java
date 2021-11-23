private void createCrime(long timestamp) {
    crimeRepository.save(newCrime(timestamp));
}