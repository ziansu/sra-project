public java.util.ArrayList<im.bernier.petfinder.model.Photo> getHiResPhotos() {
    java.util.ArrayList<im.bernier.petfinder.model.Photo> hiRes = new java.util.ArrayList<>();
    if ((photos) != null) {
        for (im.bernier.petfinder.model.Photo photo : photos) {
            if (photo.getSize().equalsIgnoreCase("x")) {
                hiRes.add(photo);
            }
        }
    }
    return hiRes;
}