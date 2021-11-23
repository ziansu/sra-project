public java.lang.String userPhoto() {
    java.lang.String email = ((java.lang.String) (javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("email")));
    com.vtlocator.jpaentityclasses.User user = userFacade.findByEmail(email);
    java.util.List<com.vtlocator.jpaentityclasses.UserPhoto> photoList = photoFacade.findPhotosByUserID(user.getId());
    if (photoList.isEmpty()) {
        return "user-placeholder.jpg";
    }
    return photoList.get(0).getExtension();
}