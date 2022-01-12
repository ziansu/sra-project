public void replaceAuxVars() {
    for (de.uni_freiburg.informatik.ultimate.logic.TermVariable tv : m_TF.getAuxVars()) {
        de.uni_freiburg.informatik.ultimate.logic.Term freshConst = m_SmtManager.getVariableManager().constructFreshConstant(tv);
        tv = transferToCurrentScriptIfNecessary(tv);
        freshConst = transferToCurrentScriptIfNecessary(freshConst);
        m_SubstitutionMapping.put(tv, freshConst);
    }
}