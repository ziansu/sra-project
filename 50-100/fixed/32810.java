public void onClickAir(android.view.View v) {
    if ((mBluetoothLeService) != null) {
        chx_plot_conti = CH0_PLOT_CONTI;
        if (!(saved_air_plot_list.isEmpty())) {
            series0.setColor(Color.WHITE);
            resetPlot();
            displaySavedData(saved_air_plot_list);
            X_axies = current_x_axis;
        }
    }
}