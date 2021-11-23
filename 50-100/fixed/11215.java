public models.Trainer searchTrainersByEmail(java.lang.String emailEntered) {
    if ((trainers.size()) > 0) {
        int i = 0;
        while (i < (trainers.size())) {
            if (trainers.get(i).getEmail().equals(emailEntered)) {
                return trainers.get(i);
            }
            i++;
        } 
        return null;
    }
    return null;
}