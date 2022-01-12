public void remove(int toRemove) {
    if (contains(toRemove)) {
        int index = 0;
        for (int i = 0; i < (listOfIntegers.size()); i++)
            if ((listOfIntegers.indexOf(i)) == toRemove) {
                index = listOfIntegers.get(i);
                java.lang.System.out.println("HEJ!");
            }
        
        listOfIntegers.remove(index);
    }
}