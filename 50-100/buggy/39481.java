@org.springframework.web.bind.annotation.RequestMapping(value = "/instructionPage", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String goToInstructionPage(org.springframework.ui.Model model) {
    com.aptikraft.spring.view.bean.UserBO userBO = com.aptikraft.common.utils.CurrentUser.getCurrentUserBO();
    userBO.setActiveLogin(true);
    getUserService().updateUser(userBO);
    int userId = userBO.getId();
    java.util.List<com.aptikraft.spring.view.bean.TestAnswerBO> testAnswerList = getTestAnswerService().fetchTestAnswerByUserId(userId);
    if ((testAnswerList != null) && (!(testAnswerList.isEmpty()))) {
        return com.aptikraft.common.utils.ViewNameConstants.INSTRUCTIONS;
    }else {
        return com.aptikraft.common.utils.ViewNameConstants.REDIRECT_TO_INDEX;
    }
}