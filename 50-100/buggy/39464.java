private void showBox() {
    java.lang.String showOrHide = "Show";
    java.lang.String objToShow = com.example.johan.ssbk.Cats.getObjImgName();
    int locationToShow = com.example.johan.ssbk.Cats.getLocationToShow(activeObjects);
    android.widget.ImageButton viewToShow = setViewToSend(locationToShow, showOrHide);
    com.example.johan.ssbk.Cats.setObjValue(locationToShow, objToShow);
    com.example.johan.ssbk.Cats.showObj(viewToShow, objToShow, context);
}