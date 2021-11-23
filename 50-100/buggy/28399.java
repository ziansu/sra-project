@org.springframework.transaction.annotation.Transactional
public void save(com.wk.Pet pet, org.springframework.web.multipart.MultipartFile image) {
    java.io.File tempFile = null;
    try {
        tempFile = java.io.File.createTempFile("temp", "");
        image.transferTo(tempFile);
        byte[] imageBytes = java.nio.file.Files.readAllBytes(tempFile.toPath());
        pet.setImage(imageBytes);
        petRepository.save(pet);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}