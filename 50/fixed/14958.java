@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    final int index = parent.indexOfComponent(this);
    final int newIndex = getSelectedIndex();
    pcgen.gui2.tools.SpinningTabbedPane aParent = parent;
    unspinAll();
    aParent.setSelectedIndex((index + newIndex));
}