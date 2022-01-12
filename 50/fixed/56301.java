public void voidItem(java.lang.String i, double p) {
    price = 0;
    price -= p;
    item = i;
    edu.cis232.SemesterProject.POS.allItems.remove(i);
}