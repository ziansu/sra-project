private ca.rmen.nounours.data.Image getRandomImage(ca.rmen.nounours.data.Image fromImage) {
    java.util.List<ca.rmen.nounours.data.Image> allAdjacentImages = fromImage.getAllAdjacentImages();
    if ((allAdjacentImages.size()) == 0)
        return null;
    
    int toImageNumber = random.nextInt(allAdjacentImages.size());
    return allAdjacentImages.get(toImageNumber);
}