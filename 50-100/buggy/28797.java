public Event remove() {
    (lentgth)--;
    if (this.isEmpty()) {
        java.lang.System.out.println("Error: removing from empty queue");
        (length)++;
        return null;
    }else
        if ((seg.getEvents().length()) == 0) {
            seg = seg.getNext();
            return ((Event) (seg.getEvents().remove()));
        }else
            return ((Event) (seg.getEvents().remove()));
        
    
}