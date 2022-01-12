protected void addFPPointsforIntent() {
    for (com.cs320.shoptimize.shoptimizeapp.Item i : items) {
        while ((i.getLocation()) == null) {
        } 
        java.lang.String s = i.getLocation();
        java.lang.String name = i.getName();
        if (!((s.charAt(0)) == 'I')) {
            java.lang.String[] xy = s.split(",");
            preprocXY.add(xy);
            preprocNAME.add(name);
        }
    }
    routingAlgorithm();
}