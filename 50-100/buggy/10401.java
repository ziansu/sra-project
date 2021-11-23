public java.util.List<com.manev.quislisting.service.taxonomy.dto.DlCategoryDTO> dlCategoryToDlCategoryDtoFlat(org.springframework.data.domain.Page<com.manev.quislisting.domain.taxonomy.discriminator.DlCategory> page) {
    java.util.Set<java.lang.Long> ids = new java.util.HashSet<>();
    java.util.List<com.manev.quislisting.service.taxonomy.dto.DlCategoryDTO> result = new java.util.ArrayList<>();
    for (com.manev.quislisting.domain.taxonomy.discriminator.DlCategory dlCategory : page) {
        doMappingAndFillDepthLevel(dlCategory, ids, result, 0);
    }
    return result;
}