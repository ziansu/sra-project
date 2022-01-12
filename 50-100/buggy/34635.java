public void orderResources() {
    java.util.List<net.canadensys.dataportal.occurrence.model.DwcaResourceModel> resources = stepController.getResourceModelList();
    java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<java.lang.String>();
    for (net.canadensys.dataportal.occurrence.model.DwcaResourceModel resource : resources) {
        if ((resource.getRecord_count()) == 0)
            names.add(resource.getName());
        
    }
    java.util.Collections.sort(names);
    for (java.lang.String name : names) {
        resourcesCmbBox.addItem(name);
    }
}