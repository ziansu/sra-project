public static javafx.scene.shape.Shape cycle(javafx.scene.shape.Shape image) {
    return sample.Transformations.quartet(image, sample.Transformations.rotate90(image), sample.Transformations.rotate180(image), sample.Transformations.rotate270(image));
}