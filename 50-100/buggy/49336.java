void setAngles(java.util.List<java.lang.String> angles) {
    getAdvStats().clearAngle();
    java.util.List<com.brookmanholmes.billiards.turn.AdvStats.Angle> list = new java.util.ArrayList<>();
    for (java.lang.String angle : angles) {
        list.add(com.brookmanholmes.bma.utils.MatchDialogHelperUtils.convertStringToAngle(context, angle));
    }
    getAdvStats().angle(list);
}