public com.mojang.ld22.item.ResourceItem findResource(com.mojang.ld22.item.resource.Resource resource) {
    for (int i = 0; i < (items.size()); i++) {
        if ((items.get(i)) instanceof com.mojang.ld22.item.ResourceItem) {
            com.mojang.ld22.item.ResourceItem has = ((com.mojang.ld22.item.ResourceItem) (items.get(i)));
            if ((has.resource) == resource)
                return has;
            
        }
    }
    return null;
}