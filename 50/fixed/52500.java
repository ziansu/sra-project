public void setProductImage(org.springframework.web.multipart.MultipartFile productImage) throws java.io.IOException, java.sql.SQLException, javax.sql.rowset.serial.SerialException {
    byte[] picBytes = productImage.getBytes();
    java.sql.Blob imageBlob = new javax.sql.rowset.serial.SerialBlob(picBytes);
    this.productImage = imageBlob;
}