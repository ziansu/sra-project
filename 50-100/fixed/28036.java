public void search() {
    ltd = new java.util.ArrayList();
    lc = new java.util.ArrayList();
    if (type.equals("tend")) {
        ltd = sb.findTenderers(keyWord);
    }else {
        lc = sb.findContractors(keyWord, 0, null, null, "ALPHABETICAL");
    }
    message = null;
}