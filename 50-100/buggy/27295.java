private void retrieveImage() {
    byte[] byteArray = transitionalImage.getImageByteArray();
    if ((transitionalImage.getImageResId()) != (-1)) {
        largeImage.setImageResource(transitionalImage.getImageResId());
        setProperties();
    }else
        if ((byteArray.length) > 0) {
            largeImage.setImageBitmap(com.mostafaaryan.transitionalimageview.utils.Utils.byteArrayToBitmap(byteArray));
            setProperties();
        }else
            finish();
        
    
}