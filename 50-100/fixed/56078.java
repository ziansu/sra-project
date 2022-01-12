private void setSelectedZeitraum() {
    stundenVon.setSelectedItem(java.lang.Integer.toString(c1.get(java.util.Calendar.HOUR_OF_DAY)));
    minutenVon.setSelectedItem(java.lang.Integer.toString((((c1.get(java.util.Calendar.MINUTE)) / 15) * 15)));
    stundenBis.setSelectedItem(java.lang.Integer.toString(c2.get(java.util.Calendar.HOUR_OF_DAY)));
    minutenBis.setSelectedItem(java.lang.Integer.toString((((c2.get(java.util.Calendar.MINUTE)) / 15) * 15)));
}