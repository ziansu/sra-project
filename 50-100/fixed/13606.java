private com.github.dockerjava.api.model.Image findImageId(com.github.dockerjava.api.DockerClient cl, java.lang.String imageTagOrIdPrefix, boolean all) {
    for (com.github.dockerjava.api.model.Image image : cl.listImagesCmd().withShowAll(all).exec()) {
        if (image.getId().startsWith(imageTagOrIdPrefix))
            return image;
        
        if ((image.getRepoTags()) == null)
            continue;
        
        for (java.lang.String tag : image.getRepoTags())
            if (tag.equals(imageTagOrIdPrefix))
                return image;
            
        
    }
    return null;
}