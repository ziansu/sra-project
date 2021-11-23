private void unsetQuickScriptMenu(int index) {
    m_quickScripts[index] = null;
    removeAllQuickScriptActionListenersFrom(m_quickMenus[index]);
    m_quickMenus[index].setEnabled(false);
    org.openide.awt.Mnemonics.setLocalizedText(m_quickMenus[index], ((("&" + (scriptKey(index))) + " - ") + (org.omegat.util.OStrings.getString("SCW_SCRIPTS_NONE"))));
}