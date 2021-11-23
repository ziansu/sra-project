public java.lang.String productCategorieName(int type_id) {
    switch (type_id) {
        case 1 :
            return getString(R.string.meat);
        case 2 :
            return getString(R.string.vegetables);
        case 3 :
            return getString(R.string.fruits);
        case 4 :
            return getString(R.string.dairy);
        case 5 :
            return getString(R.string.wheat);
        case 6 :
            return getString(R.string.other);
        default :
            return "";
    }
}