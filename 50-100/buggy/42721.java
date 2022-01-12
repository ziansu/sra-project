public void setObjects(java.util.ArrayList<dynamite.zafroshops.app.data.MobileZop> objects) {
    if ((this.objects) == null) {
        this.objects = new java.util.ArrayList<>();
    }else {
        this.objects.clear();
    }
    if (objects != null) {
        this.objects.addAll(objects);
        java.util.Collections.sort(objects, ordering);
    }
}