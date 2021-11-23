public java.lang.String listCats(java.util.ArrayList<Cat> catList) {
    java.lang.String list = "";
    for (Cat cat : catList) {
        if (!(cat.returnCat())) {
            list = (list + (cat.toString())) + "\n";
        }
    }
    return list;
}