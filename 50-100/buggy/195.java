public void setStatus(managerScore.controller.ManagerScore managerScore, java.lang.String input) {
    if ((Status.wait_input.equals(managerScore.getCurrentStatus())) && (input.trim().matches("[123]"))) {
        if ("1".equals(input)) {
            managerScore.setCurrentStatus(Status.wait_add_student_info);
        }else
            if ("2".equals(input)) {
                managerScore.setCurrentStatus(Status.wait_get_student_score_report);
            }else
                if ("3".equals(input)) {
                    managerScore.setCurrentStatus(Status.exit);
                }
            
        
    }
}