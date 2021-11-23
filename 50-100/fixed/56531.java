public void setByteArray(java.util.ArrayList byteArray) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    if (byteArray != null) {
        for (java.lang.Object element : byteArray) {
            builder.append(java.lang.String.format("%02X ", ((java.lang.Double) (element)).byteValue()));
            builder.append(" ");
        }
    }
    this.byteArray.setText(builder.toString());
}