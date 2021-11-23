@java.lang.Override
public void keyTyped(java.awt.event.KeyEvent e) {
    org.magic.api.beans.MagicCard mc = ((org.magic.api.beans.MagicCard) (tableDeck.getValueAt(tableDeck.getSelectedRow(), 0)));
    if ((e.getKeyCode()) == 0) {
        deck.getMap().remove(mc);
        deckmodel.init(deck);
    }
}