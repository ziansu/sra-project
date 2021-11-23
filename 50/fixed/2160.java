@java.lang.Override
public void menuSelected(javax.swing.event.MenuEvent e) {
    remove(artistTabbedPane);
    remove(artworkTabbedPane);
    remove(inventoryTabbedPane);
    add(customerTabbedPane);
    revalidate();
    repaint();
    java.lang.System.out.println("menuSelected");
}