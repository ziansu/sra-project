public static void initDebug() {
    java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(2000, 2000, java.awt.image.BufferedImage.TYPE_INT_RGB);
    kn.uni.voronoitreemap.diagram.PowerDiagram.frame = new kn.uni.voronoitreemap.debuge.ImageFrame(image);
    kn.uni.voronoitreemap.diagram.PowerDiagram.frame.setVisible(true);
    kn.uni.voronoitreemap.diagram.PowerDiagram.frame.setBounds(20, 20, 1600, 800);
    kn.uni.voronoitreemap.diagram.PowerDiagram.graphics = image.createGraphics();
    kn.uni.voronoitreemap.diagram.PowerDiagram.graphics.translate(200, 200);
}