private java.lang.String getTemperature(double baseTemp) {
    java.lang.String unit = gdm.getUserData().get(2);
    java.lang.String temp;
    if (unit.equals("C°")) {
        temp = java.lang.String.valueOf(java.lang.Math.round((baseTemp - 273.15F)));
        return temp;
    }else {
        temp = java.lang.String.valueOf(((((java.lang.Math.round((baseTemp - 273.15F))) * 9) / 5) + 32));
        return temp;
    }
}