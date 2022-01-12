public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.btnMin :
            fill(calculationNormsWater.drink_volume_min);
            break;
        case R.id.btnMax :
            fill(calculationNormsWater.drink_volume_max);
            break;
        case R.id.btnCancel :
            cancel();
            break;
        case R.id.btnClear :
            clear();
            break;
    }
}