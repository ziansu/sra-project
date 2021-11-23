public void printOccupied() {
    java.util.Iterator it = occupied.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry<clue.Helpers.Location, java.lang.Boolean> pair = ((java.util.Map.Entry) (it.next()));
        java.lang.System.out.println(((("LENDER -- VALUES -- " + (pair.getKey().toString())) + " with color ") + (pair.getKey().getColor())));
    } 
}