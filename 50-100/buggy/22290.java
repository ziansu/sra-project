@java.lang.Override
public java.util.List<design.pattern.filter.Animal> meetCriteria(java.util.List<design.pattern.filter.Animal> animals) {
    java.util.List<design.pattern.filter.Animal> typeAnimals = new java.util.ArrayList<>();
    for (design.pattern.filter.Animal animal : typeAnimals) {
        if ((animal.getType()) == (type)) {
            typeAnimals.add(animal);
        }
    }
    return typeAnimals;
}