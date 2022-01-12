public void removeDog(int id) {
    java.util.Iterator<dv512.model.Dog> itr = profile.getDogs().iterator();
    while (itr.hasNext()) {
        dv512.model.Dog d = itr.next();
        if ((d.getId()) == id) {
            pendDogDel.add(d);
        }
    } 
}