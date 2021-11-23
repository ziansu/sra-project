private void getPackage(java.lang.Class clazz) {
    if ((clazz.getPackage()) != null) {
        sb.append((((clazz.getPackage()) + ";") + "\n\n"));
    }
}