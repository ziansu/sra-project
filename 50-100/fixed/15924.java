private void photoClicked(br.com.jeancsanchez.photoviewslider.Photo photo) {
    generatePhotoDetail();
    for (int i = 0; i < (photos.size()); i++)
        if ((photos.get(i)) == photo)
            currentPosition = i;
        
    
    showImage(photo.getImage(), photo.getDescription(), currentPosition);
}