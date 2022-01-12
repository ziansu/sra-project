protected void validateLaunch(com.sixsq.slipstream.persistence.Run run, com.sixsq.slipstream.persistence.User user) throws com.sixsq.slipstream.exceptions.ValidationException {
    java.lang.String instanceSize = getInstanceType(run);
    if (((instanceSize == null) || (instanceSize.isEmpty())) || ("".equals(instanceSize))) {
        throw new com.sixsq.slipstream.exceptions.ValidationException("Instance type cannot be empty.");
    }
    java.lang.String imageId = getImageId(run, user);
    if ((imageId == null) || ("".equals(imageId))) {
        throw new com.sixsq.slipstream.exceptions.ValidationException("Image ID cannot be empty");
    }
}