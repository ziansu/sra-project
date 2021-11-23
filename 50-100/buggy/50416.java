public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.btnMin :
            fill(calculationNormsWater.drink_volume_min, BottleParams.CANCEL_200_ML);
            break;
        case R.id.btnMax :
            fill(calculationNormsWater.drink_volume_max, BottleParams.CANCEL_400_ML);
            break;
        case R.id.btnCancel :
            cancel();
            break;
        case R.id.btnClear :
            clear();
            break;
    }
}