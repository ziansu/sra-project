public DogPet getDog(int id) {
    for (java.util.Iterator i = dogs.iterator(); i.hasNext();) {
        DogPet dog = ((DogPet) (i.next()));
        if ((dog.getId()) == id) {
            return dog;
        }
    }
    return null;
}