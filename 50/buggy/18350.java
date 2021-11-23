private void noDevices() {
    if (this.deviceID.equals("")) {
        this.ShowToast("Aún no tienes un dispositivo", Toast.LENGTH_SHORT);
        return ;
    }
}