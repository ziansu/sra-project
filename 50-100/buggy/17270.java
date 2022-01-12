@java.lang.Override
public org.unidal.web.mvc.ActionContext.Query get(java.lang.Object key) {
    java.lang.String str = java.lang.String.valueOf(key);
    if (!(m_inKey)) {
        m_key = str;
        m_inKey = true;
    }else {
        if ((m_compact) && ((str.length()) == 0)) {
            m_map.remove(m_key);
        }else {
            m_map.put(m_key, str);
        }
        m_key = null;
        m_inKey = false;
    }
    return this;
}