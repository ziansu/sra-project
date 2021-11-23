public void removeEncodedPhoto() {
    if ((this.encodedPhoto.size()) != 0) {
        if ((this.encodedPhoto.get(0)) != null) {
            this.encodedPhoto.remove(0);
        }
    }
}