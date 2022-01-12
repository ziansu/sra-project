java.util.ArrayList<instancefactory.service.Eintrag> shift(java.util.ArrayList<instancefactory.service.Eintrag> list, java.lang.Integer shiftValue) {
    java.util.ArrayList<instancefactory.service.Eintrag> newList = ((java.util.ArrayList<instancefactory.service.Eintrag>) (list.clone()));
    for (int i = 0; i < (newList.size()); i++) {
        newList.get(i).value = (newList.get(i).value) - shiftValue;
    }
    return newList;
}