public java.util.ArrayList<ir.rasen.charsoo.controller.object.PackageInfoCustom> getAppList() {
    if ((appList) != null) {
        java.util.ArrayList<ir.rasen.charsoo.controller.object.PackageInfoCustom> temp = new java.util.ArrayList<>();
        for (int i = 0; i < (appList.size()); i++) {
            temp.add(appList.get(i));
        }
        return temp;
    }else
        return null;
    
}