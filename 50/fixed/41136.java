public static void addItem(final java.lang.Integer id, final java.lang.String itemName) {
    net.sourceforge.kolmafia.swingui.DatabaseFrame.allItems.add(new net.sourceforge.kolmafia.utilities.LowerCaseEntry(id, itemName));
    net.sourceforge.kolmafia.swingui.DatabaseFrame.allItems.sort(new net.sourceforge.kolmafia.swingui.DatabaseFrame.IntegerEntryKeyComparator());
}