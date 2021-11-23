@java.lang.Override
public void mouseClicked() {
    if ((lastClicked) != null) {
        showAll();
        lastClicked = null;
    }else {
        boolean findFirstEarthQuake = findAndShowOneQuake();
        if (findFirstEarthQuake) {
            showCitiesInDanger();
        }else {
            boolean findFirstCity = findAndShowOneCity();
            if (findFirstCity) {
                showQuakesInVecinity();
            }else {
                showAll();
            }
        }
    }
}