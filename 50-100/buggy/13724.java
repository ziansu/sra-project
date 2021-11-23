public void printCurrentData() {
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(java.util.Calendar.getInstance().getTime());
    java.lang.System.out.println(((((((((((timeStamp + ":") + (this.ect)) + (this.iat)) + " fuel[") + (this.fuelPressure)) + "psi]") + (this.tps)) + " IAC[") + (this.iac)) + "steps]"));
}