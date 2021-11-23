private org.occideas.vo.QuestionVO processIntroModuleInterview(java.util.List<org.occideas.vo.InterviewVO> list) {
    org.occideas.vo.QuestionVO questionVO = null;
    for (org.occideas.vo.InterviewVO interviewVO : list) {
        if (interviewVO.getModule().getType().equalsIgnoreCase(INTRO_MODULE)) {
            questionVO = this.getNearestQuestion(interviewVO);
        }
        if (questionVO != null) {
            questionVO.setActiveInterviewId(interviewVO.getInterviewId());
            break;
        }
    }
    return questionVO;
}