public void replaceAuxVars() {
    for (de.uni_freiburg.informatik.ultimate.logic.TermVariable tv : m_TF.getAuxVars()) {
        tv = transferToCurrentScriptIfNecessary(tv);
        de.uni_freiburg.informatik.ultimate.logic.Term freshConst = m_SmtManager.getVariableManager().constructFreshConstant(tv);
        m_SubstitutionMapping.put(tv, freshConst);
    }
}