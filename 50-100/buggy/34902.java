public void animalSounds() {
    for (int i = 0; i < (aBunchOfAnimals.length); i++) {
        java.lang.System.out.println((((aBunchOfAnimals[i].getType()) + " goes ") + (aBunchOfAnimals[i].getSound())));
        java.lang.System.out.println(("The cow is known as " + (((NamedCow) (aBunchOfAnimals[0])).getName())));
    }
}