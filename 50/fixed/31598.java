private void showAnimalInfo(int currentIndex) {
    views.setMyAnimal(myAnimals.get(currentIndex));
    views.imageBlock.setImageURI(android.net.Uri.parse(myAnimals.get(currentIndex).getImageUri()));
}