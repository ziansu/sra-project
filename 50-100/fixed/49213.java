public static org.codice.imaging.nitf.render.imagerep.ImageRepresentationHandler forImageSegment(final org.codice.imaging.nitf.core.image.ImageSegment segment) {
    switch (segment.getImageRepresentation()) {
        case MONOCHROME :
            return org.codice.imaging.nitf.render.imagerep.ImageRepresentationHandlerFactory.getMonoImageRepresentationHandler(segment, 0);
        case RGBTRUECOLOUR :
            return org.codice.imaging.nitf.render.imagerep.ImageRepresentationHandlerFactory.getRgbImageRepresentationHandler(segment);
        case MULTIBAND :
            return org.codice.imaging.nitf.render.imagerep.ImageRepresentationHandlerFactory.getHandlerForMultiband(segment);
        case RGBLUT :
            return org.codice.imaging.nitf.render.imagerep.ImageRepresentationHandlerFactory.getRgbLUTImageRepresentationHandler(segment, 0);
        case NOTFORDISPLAY :
        default :
            return new org.codice.imaging.nitf.render.imagerep.NoDisplayImageRepresentationHandler();
    }
}