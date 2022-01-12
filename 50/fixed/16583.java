public void removeAll() {
    while ((componentsArray.size) > 0) {
        remove(componentsArray.get(0).getClass());
    } 
}