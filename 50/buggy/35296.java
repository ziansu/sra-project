public void setData(java.util.ArrayList<com.rudolf.shane.flickrshark.model.FlickrSearchPhotoModel.PhotoModel> photos) {
    this.photos = photos;
    if ((itemCount) == null)
        itemCount = this.photos.size();
    
}