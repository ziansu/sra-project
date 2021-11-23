@java.lang.Override
public boolean equals(java.lang.Object otherEndangeredAnimal) {
    if (otherEndangeredAnimal instanceof Endangered) {
        Endangered newEndangeredAnimal = ((Endangered) (otherEndangeredAnimal));
        return this.getName().equals(newEndangeredAnimal.getName());
    }
    return false;
}