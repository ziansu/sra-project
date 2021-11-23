public void setStatus(managerScore.controller.ManagerScore managerScore, java.lang.String input) {
    if ((Status.wait_input.equals(managerScore.getCurrentStatus())) && (input.trim().matches("[123]"))) {
        switch (input) {
            case "1" :
                managerScore.setCurrentStatus(Status.wait_add_student_info);
                break;
            case "2" :
                managerScore.setCurrentStatus(Status.wait_get_student_score_report);
                break;
            case "3" :
                managerScore.setCurrentStatus(Status.exit);
                break;
        }
    }
}