private static void initComp() {
    GUI.EstimationScreen.incidentData = new GUI.IncidentRateData();
    GUI.EstimationScreen.crashRateData = new GUI.CrashRateData();
    GUI.EstimationScreen.incidentSevData = new GUI.IncidentSeverityData();
    GUI.EstimationScreen.mainpanel.setPreferredSize(new java.awt.Dimension(800, 400));
    GUI.EstimationScreen.mainpanel.setLayout(new javax.swing.BoxLayout(GUI.EstimationScreen.mainpanel, javax.swing.BoxLayout.Y_AXIS));
    GUI.EstimationScreen.mainpanel.add(javax.swing.Box.createVerticalStrut(20));
    GUI.EstimationScreen.mainpanel.add(GUI.EstimationScreen.getEstimationButtonPanel());
    GUI.EstimationScreen.mainpanel.add(GUI.EstimationScreen.getSetupPanel());
    GUI.EstimationScreen.mainpanel.add(GUI.EstimationScreen.getinfoTable());
}