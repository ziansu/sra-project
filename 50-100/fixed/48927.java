private void performUpdateSubViews() {
    if ((subViewsMap) != null) {
        for (org.openflexo.gina.view.FIBView v : new java.util.ArrayList<org.openflexo.gina.view.FIBView>(subViewsMap.values())) {
            if (!(v.isDeleted())) {
                v.update();
            }
        }
    }
}