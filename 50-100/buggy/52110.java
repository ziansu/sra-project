@java.lang.Override
public org.randoom.setlx.utilities.Graph addBullets(org.randoom.setlx.utilities.Canvas canvas, java.util.List<java.util.List<java.lang.Double>> bullets, java.util.List<java.lang.Integer> color) {
    java.lang.System.out.println("addBullet");
    return canvas.getFrame().addBulletDataset("Bullets", bullets, new org.jfree.chart.ChartColor(color.get(0), color.get(1), color.get(2)));
}