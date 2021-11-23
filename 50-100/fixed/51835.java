private void populateChildFolder(com.integrasolusi.pusda.sisda.web.dto.patternplansda.PatternPlanSdaFolderDto parentDto, com.integrasolusi.pusda.sisda.persistence.patternplanning.PolaRencanaPsdaFolder folder) {
    java.util.List<com.integrasolusi.pusda.sisda.persistence.patternplanning.PolaRencanaPsdaFolder> children = polaRencanaPsdaFolderService.findByParent(folder);
    for (com.integrasolusi.pusda.sisda.persistence.patternplanning.PolaRencanaPsdaFolder child : children) {
        com.integrasolusi.pusda.sisda.web.dto.patternplansda.PatternPlanSdaFolderDto dto = new com.integrasolusi.pusda.sisda.web.dto.patternplansda.PatternPlanSdaFolderDto();
        dto.setId(child.getId());
        dto.setName(child.getName());
        dto.setIndex(child.getIndex());
        parentDto.getChildren().add(dto);
        populateChildFolder(dto, child);
        populateItems(dto, child);
    }
}