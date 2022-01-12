public boolean isVistor() {
    if ((bundle.getString("isVistor")) != null) {
        java.lang.String vistor = bundle.getString("isVistor");
        if (vistor.toString().equals("Y")) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}