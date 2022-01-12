public de.lmu.ifi.dbs.elki.visualization.svg.SVGPath drawTo(double[] xy) {
    return !(isStarted()) ? moveTo(xy[0], xy[1]) : lineTo(xy[0], xy[1]);
}