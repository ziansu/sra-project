private java.util.HashMap<com.professionallyevil.co2.StatItem, java.lang.Integer> getSurnamesMap() throws java.lang.Exception {
    int percent = startSlider.getValue();
    int max = ((surnamesMax) * percent) / 100;
    java.util.HashMap<com.professionallyevil.co2.StatItem, java.lang.Integer> stats = new java.util.HashMap<com.professionallyevil.co2.StatItem, java.lang.Integer>(max);
    readListInto("surnames_census2000.csv", stats, max, surnamesLowercaseChk.isSelected(), surnameMixedcaseChk.isSelected(), surnameUppercaseChk.isSelected(), false, false);
    return stats;
}