protected void validateLaunch(com.sixsq.slipstream.persistence.Run run, com.sixsq.slipstream.persistence.User user) throws com.sixsq.slipstream.exceptions.ValidationException {
    java.lang.String imageId = getImageId(run, user);
    if ((imageId == null) || ("".equals(imageId))) {
        throw new com.sixsq.slipstream.exceptions.ValidationException("Image ID cannot be empty");
    }
}