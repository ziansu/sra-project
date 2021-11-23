public java.util.ArrayList<java.lang.String> checkSearchString(java.lang.CharSequence s) {
    searchInput = s.toString();
    for (int i = 0; i < (medicines.length); i++) {
        medicineName = medicines[i][0].toString();
        if (medicineName.toLowerCase().startsWith(searchInput.toLowerCase())) {
            tempArray.add(medicineName);
        }
    }
    return tempArray;
}