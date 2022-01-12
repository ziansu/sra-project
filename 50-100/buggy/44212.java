private ca.rmen.nounours.data.Image getRandomImage(ca.rmen.nounours.data.Image fromImage) {
    java.util.Map<java.lang.String, ca.rmen.nounours.data.Image> images = getImages();
    java.util.List<ca.rmen.nounours.data.Image> allAdjacentImages = fromImage.getAllAdjacentImages();
    if ((allAdjacentImages.size()) == 0)
        return null;
    
    int toImageNumber = random.nextInt(allAdjacentImages.size());
    ca.rmen.nounours.data.Image toImage = allAdjacentImages.get(toImageNumber);
    return toImage;
}