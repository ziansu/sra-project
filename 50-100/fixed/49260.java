public DogPet getDog(java.lang.String id) {
    for (java.util.Iterator<DogPet> i = dogs.iterator(); i.hasNext();) {
        DogPet dog = i.next();
        if (dog.getId().equals(id)) {
            return dog;
        }
    }
    return null;
}