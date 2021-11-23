public static void main(java.lang.String[] args) {
    java.lang.String name = args[0];
    java.awt.image.BufferedImage image = ca.uwaterloo.enghack17.cvision.IOImage.load_image(name);
    final int num_expected = 5;
    java.awt.Color[] expected = ca.uwaterloo.enghack17.cvision.MedianColors.find(image, num_colors);
    java.awt.image.BufferedImage heatmap = ca.uwaterloo.enghack17.cvision.MapHeat.heatmap(image, expected);
    final java.lang.String prefix = "processed_";
    ca.uwaterloo.enghack17.cvision.IOImage.save_image(heatmap, (prefix + name));
}