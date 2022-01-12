public void searchRoutes(java.lang.String vertrek, java.lang.String bestemming) {
    java.util.List<model.Traject> trajecten = null;
    try {
        trajecten = new controller.ParseController().getTraject(vertrek, bestemming);
    } catch (java.lang.Exception e) {
        view.showGeenGeldigeRoute();
    }
    if (trajecten == null) {
        view.showGeenGeldigeRoute();
    }else {
        view.showSearchedRoutes(trajecten);
    }
}