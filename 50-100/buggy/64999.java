private void addResource(untouchedwagons.minecraft.mcrd.api.resources.IResource newResource, java.util.List<untouchedwagons.minecraft.mcrd.api.resources.IResource> resourceList) {
    for (untouchedwagons.minecraft.mcrd.api.resources.IResource resource : resourceList) {
        if (newResource.equals(resource)) {
            newResource.setCount(((newResource.getCount()) + (resource.getCount())));
            return ;
        }
    }
    resourceList.add(newResource);
}