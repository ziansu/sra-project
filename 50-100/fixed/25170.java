@java.lang.Override
public void visitWithTransform(gnu.kawa.models.WithTransform pic) {
    java.awt.geom.AffineTransform savedTransform = transform;
    try {
        transform = pic.transform;
        if (savedTransform != null) {
            transform = new java.awt.geom.AffineTransform(transform);
            transform.preConcatenate(savedTransform);
        }
        super.visitWithTransform(pic);
    } finally {
        transform = savedTransform;
    }
}