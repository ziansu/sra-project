@java.lang.Override
public void setCarPhotoId(java.lang.String photoId) {
    ru.nadocars.messanger.json.car.Photo photo = new ru.nadocars.messanger.json.car.Photo();
    photo.setId(photoId);
    java.util.List<ru.nadocars.messanger.json.car.Photo> photos = mProfilePresenter.getGetCarsResponse().getResponse().getItems().get(mCarCounter).getPhotos();
    photos.add(photo);
    mProfilePresenter.getGetCarsResponse().getResponse().getItems().get(mCarCounter).setPhotos(photos);
    java.lang.System.out.println();
}