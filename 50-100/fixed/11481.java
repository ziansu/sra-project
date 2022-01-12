@java.lang.Override
public boolean equals(final java.lang.Object o) {
    if (o == (this))
        return true;
    
    if (!(super.equals(o)))
        return false;
    
    final com.helger.photon.core.ajax.response.AjaxHtmlResponse rhs = ((com.helger.photon.core.ajax.response.AjaxHtmlResponse) (o));
    return (com.helger.commons.equals.EqualsHelper.equals(m_sErrorMessage, rhs.m_sErrorMessage)) && (m_aSuccessValue.equals(rhs.m_aSuccessValue));
}