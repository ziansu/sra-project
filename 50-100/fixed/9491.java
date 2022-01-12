public drgn.data.routes.mathematics.Line getParallelLine(drgn.data.routes.model.Point point) {
    return new drgn.data.routes.mathematics.Line(_a, _b, (-(((_a) * (point.getLongitude())) + ((_b) * (point.getLatitude())))), point);
}