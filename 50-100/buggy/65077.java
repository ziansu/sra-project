cmri.snapshot.api.domain.Photo createPhoto(javax.servlet.http.HttpServletRequest request, long uid, long worksId, org.springframework.web.multipart.MultipartFile img) throws java.io.IOException {
    java.lang.String filename = cmri.snapshot.api.controller.ImageController.uploadImg(request, img).getKey();
    cmri.snapshot.api.domain.Photo photo = cmri.snapshot.api.domain.Photo.newOne();
    photo.setWorksId(worksId);
    photo.setUserId(uid);
    photo.setPhoto(filename);
    return photo;
}