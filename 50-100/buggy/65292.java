void setUser(vn.edu.uit.jrfsit.entity.User user1) {
    try {
        java.lang.Thread.sleep(1000L);
    } catch (java.lang.InterruptedException interruptedexception) {
    }
    tvPsEmail.setText(user1.getEmail());
    tvPsTNumber.setText(user1.getPhone());
    tvPsAddress.setText(user1.getAddress());
    tvPsBirhday.setText(user1.getBirthday());
    tvPsGender.setText(user1.getGender());
    tvUserEx.setText(user1.getCareerObjective());
}