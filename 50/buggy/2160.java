@java.lang.Override
public void menuSelected(javax.swing.event.MenuEvent e) {
    remove(customerTabbedPane);
    remove(artworkTabbedPane);
    remove(inventoryTabbedPane);
    add(artistTabbedPane);
    revalidate();
    repaint();
    java.lang.System.out.println("menuSelected");
}