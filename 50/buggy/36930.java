public static java.lang.String formatCurrency(int tongTien) {
    java.util.Locale vn = new java.util.Locale("vn", "VN");
    java.text.NumberFormat vnFormat = java.text.NumberFormat.getCurrencyInstance(vn);
    return vnFormat.format(tongTien).substring(1);
}