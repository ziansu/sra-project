private void serialPortExceptionHandler(final jssc.SerialPortException e) {
    ctrl.showMessageOnView(("Errore nella ricezione dei dati della chiamata. \nUna telefonata potrebbe non essere stata registrata. \n" + e));
    ctrl.addCall((-2), input);
    started = false;
}