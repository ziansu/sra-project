public drgn.data.routes.mathematics.Line getPerpendicularLine(drgn.data.routes.model.Point point) {
    return new drgn.data.routes.mathematics.Line(_b, (-(_a)), (((_a) * (point.getLatitude())) - ((_b) * (point.getLongitude()))));
}