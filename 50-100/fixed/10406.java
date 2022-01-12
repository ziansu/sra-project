@java.lang.Override
public void validate(java.lang.Object target, org.springframework.validation.Errors errors) {
    com.pce.domain.dto.PukGroupForPukDto pukGroupDto = ((com.pce.domain.dto.PukGroupForPukDto) (target));
    if (pukGroupDto != null) {
        long pukGroupId = pukGroupDto.getPukGroupId();
        java.util.Optional<com.pce.domain.PukGroup> pukGroupById = pukGroupService.getPukGroupById(pukGroupId);
        if (!(pukGroupById.isPresent())) {
            errors.rejectValue("pukGroupId", "pukGroup.not.exists", (("Puk Group " + pukGroupId) + " is not exists in the system, please select different one"));
        }
    }
}