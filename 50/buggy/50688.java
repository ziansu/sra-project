@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    selectedRating = e.getItem().toString();
    java.lang.System.out.println(e);
    java.lang.System.out.println(e.getItem());
}