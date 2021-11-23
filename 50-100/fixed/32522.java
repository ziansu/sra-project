@com.churchsystem.controller.ResponseBody
@com.churchsystem.controller.RequestMapping(value = com.churchsystem.common.constants.PageConstant.CLASS_REGISTRATION, method = RequestMethod.POST)
public int classRegister(@com.churchsystem.controller.RequestParam(value = com.churchsystem.common.constants.ParamConstant.CHURCH_ID)
java.lang.String churchIdStr, @com.churchsystem.controller.RequestParam(value = com.churchsystem.common.constants.ParamConstant.SUBJECT_ID)
java.lang.String subIdStr, @com.churchsystem.controller.RequestParam(value = com.churchsystem.common.constants.ParamConstant.REGISTRATION_MESSAGE)
java.lang.String message) {
    try {
        org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
        com.churchsystem.controller.UserEntity userEntity = userServiceInterface.getUserByAccountId(auth.getName());
        int subId = java.lang.Integer.parseInt(subIdStr);
        int churchId = java.lang.Integer.parseInt(churchIdStr);
        java.lang.Integer manager = userServiceInterface.getChurchManager(churchId);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return 0;
    }
    return 1;
}