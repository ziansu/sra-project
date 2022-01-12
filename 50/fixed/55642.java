void addDrug(java.lang.String name, java.lang.String id) {
    if (!(drugInStore.containsKey(name))) {
        drugInStore.put(name, id);
        drugModel.addElement(name);
    }else
        java.lang.System.out.println("This drug has already existed!");
    
}