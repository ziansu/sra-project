@javax.ws.rs.GET
@javax.ws.rs.Path(value = ((GALLERY_PHOTOS_PART) + "/{photoId}/") + (GALLERY_MEDIA_CONTENT_PART))
@javax.ws.rs.Produces(value = "image/*")
public javax.ws.rs.core.Response getPhotoContent(@javax.ws.rs.PathParam(value = "photoId")
final java.lang.String photoId, @javax.ws.rs.QueryParam(value = GALLERY_PHOTO_RESOLUTION_PARAM)
com.silverpeas.gallery.constant.MediaResolution mediaResolution) {
    if (mediaResolution == null) {
        mediaResolution = com.silverpeas.gallery.constant.MediaResolution.ORIGINAL;
    }
    return getMediaContent(com.silverpeas.gallery.web.Photo, photoId, mediaResolution);
}