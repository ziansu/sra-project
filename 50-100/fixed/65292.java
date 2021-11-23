void setUser(vn.edu.uit.jrfsit.entity.User user1) {
    tvPsEmail.setText(user1.getEmail());
    tvPsTNumber.setText(user1.getPhone());
    tvPsAddress.setText(user1.getAddress());
    tvPsBirhday.setText(user1.getBirthday());
    tvPsGender.setText(user1.getGender());
    tvUserEx.setText(user1.getCareerObjective());
}