public br.com.devmedia.blog.entity.Avatar getAvatarByUpload(org.springframework.web.multipart.MultipartFile file) {
    br.com.devmedia.blog.entity.Avatar avatar = new br.com.devmedia.blog.entity.Avatar();
    if ((file != null) && (file.isEmpty())) {
        try {
            avatar.setTitulo(file.getOriginalFilename());
            avatar.setTipo(file.getContentType());
            avatar.setAvatar(file.getBytes());
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }
    return avatar;
}